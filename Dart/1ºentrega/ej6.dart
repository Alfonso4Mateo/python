//Ejercicio 6. Map (pares clave–valor)
//Crea un Map llamado persona con las claves y valores 
//siguientes: 'nombre' (tu nombre), 'edad' (tu edad) 
//y 'activo' (un valor booleano). 
//Cambia el valor de 'edad'. Añade una nueva clave 'ciudad'. 
//Recorre el mapa con .forEach() para mostrar todas las claves y valores.

void main(){

Map<String,dynamic> persona = {
  "nombre":"Alfon",
  "edad": 30,
  "activo": true
};

print(persona);

persona["edad"] = 31;
persona["ciudad"]="jerez";

persona.forEach((key,value){
  print("$key:$value");
});

}