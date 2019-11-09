/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.Persona;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sebas-AAMG
 */
@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    List datos;
    int id;

    @RequestMapping("index.htm")
    public ModelAndView List() {
        String sql = "select * from persona";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mav.addObject(new Persona());
        mav.setViewName("agregar");
        return mav;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Persona p) {
        String sql = "insert into persona (nombres, correo, nacionalidad) values (?,?,?)";
        this.jdbcTemplate.update(sql, p.getNombre(), p.getCorreo(), p.getNacionalidad());
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping(value = "modificar.htm", method = RequestMethod.GET)
    public ModelAndView Modificar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from persona where id = " + id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("modificar");
        return mav;
    }

    @RequestMapping(value = "modificar.htm", method = RequestMethod.POST)
    public ModelAndView Modificar(Persona p) {
        String sql = "update persona set nombres=?, correo=?, nacionalidad=? where id = " + id;
        this.jdbcTemplate.update(sql, p.getNombre(), p.getCorreo(), p.getNacionalidad());
        return new ModelAndView("redirect:/index.htm");
    }

    @RequestMapping("eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from persona where id = " + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
}
