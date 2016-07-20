# ¡Hola, Mundo!

## Contexto
> En informática, un programa Hola mundo es el que imprime el texto «¡Hola, mundo!» en un dispositivo de visualización, en la mayoría de los casos una pantalla de monitor. Este programa suele ser usado como introducción al estudio de un lenguaje de programación, siendo un primer ejercicio típico, y se lo considera fundamental desde el punto de vista didáctico.  
> El programa Hola Mundo también puede ser útil como **prueba de configuración para asegurar que el compilador, el entorno de desarrollo y el entorno de ejecución estén instalados correctamente y funcionando**. En algunos lenguajes, configurar un conjunto de herramientas básicas completo desde cero hasta el punto en que los programas triviales puedan ser compilados y ejecutados involucra una cantidad de trabajo sustancial. Por esta razón, generalmente es usado un programa muy simple para probar un nuevo conjunto de herramientas.
[Wikipedia](https://es.wikipedia.org/wiki/Hola_mundo)

Existe una infinidad de implementaciones de programas *¡Hola, Mundo!*. Incluso hay colecciones completas, como la de [RosettaCode](http://rosettacode.org/wiki/Hello_world/Text), o la renombrada [Hello World Collection](http://helloworldcollection.de/). En este caso, programaremos un pequeño _¡Hola, Mundo!_ que nos permita verificar que podemos trabajar con el entorno de correcciones de **Loom**.

## Consigna
Se pide implementar una solución que permita saludar a una persona por su nombre.  
Aquí un test de aceptacion, especificando cómo debe funcionar:


```java
public class HolaMundoTests {
    @Test
    public void queSaludaCorrectamente() {
        HolaMundo holaMundo = new HolaMundo();
        Assert.assertEquals("¡Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
    }
}
```

### Material proporcionado
Se otorga la clase `HolaMundo`, de la cual se pide implementar el método `saludar(final String persona):String`. Este método no puede cambiar su firma, pero debe ser implementado para pasar el caso de prueba anteriormente citado.

## Criterios de evaluación
Este trabajo tendrá una nota normalizada en 10.0 puntos, los cuales se componen según el siguiente detalle:

<table>
 <thead>
 <tr>
  <th>Concepto</th>
  <th>Puntos totales</th>
  <th>Porcentaje sobre el total</th>
 </tr>
 </thead>
 <tr>
  <td>Funcionalidad</td>
  <td>8.0</td>
  <td>80 %</td>
 </tr>
 <tr>
  <td>Estilo</td>
  <td>2.0</td>
  <td>20 %</td>
 </tr>
 <tr>
  <td>Total</td>
  <td>10.0</td>
  <td>100 %</td>
 </tr>
</table>

Por lo tanto, se evaluará tanto la correctitud como el estilo (tabulación, espacios, nombres, etcétera) en tu código.
Entre los criterios de estilo, esta vez deberás agregar la documentación a todos los métodos del proyecto.

## Consideraciones

1. Recordá no cambiar la firma de los métodos proporcionados por la cátedra.
2. Podés hacer **tantos tests como consideres necesarios**, pero los mismos no se utilizarán para evaluar tu código.
3. Recordá que podés enviar la tarea a corrección tantas veces como quieras.
