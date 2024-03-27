export class persona{
    // El ? significa que no es necesario el dato
    id?:  number;
    nombre: String;
    apellido: String;
    img: String;

    constructor(nombre: String,apellido: String,img: String)
    {
        this.nombre = nombre;
        this.apellido =apellido;
        this.img = img;
    }
}