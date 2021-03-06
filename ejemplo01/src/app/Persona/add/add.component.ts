import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Persona } from 'src/app/Modelo/persona';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Guardar(persona:Persona){

    alert("nombre: ");
    alert("nombre: " + persona.apellidos);
    alert("nombre: " + persona.nombre);

    this.service.createPersona(persona)
    .subscribe(data=>{
      alert("Se agrego con exito.");
      this.router.navigate(["listar"]);
    })
  }
}
