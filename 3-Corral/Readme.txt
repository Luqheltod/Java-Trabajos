Práctica I – Realización de un sistema informático con
programación orientado a objetos en Java

Introducción
El objetivo de esta práctica es que aprendáis a programar con el paradigma de programación
orientado a objetos. Por este motivo, aplicaréis algunos conceptos básicos de este paradigma, como
por ejemplo el polimorfismo. Para ello, tenéis que implementar un sistema informático sobre la
simulación de un “Corral de animales” con las indicaciones que se indican en el enunciado.
Esta práctica se realizará en Java, y necesitáis un entorno de desarrollo para dicho lenguaje.
Cualquier entorno de desarrollo de Java que tengáis vale para realizar la práctica. Si no tenéis
ninguno, podéis usar Eclipse o NetBeans, que son gratuitos.

CONSEJOS INICIALES: Al realizar esta práctica, haced parte por parte y comprobad que cada
parte compila y funciona, antes de pasar a la siguiente. Cada vez que creéis una clase no abstracta,
comprobad que se puede instanciar (definir un objeto de la clase) y que el comportamiento de sus
métodos es el adecuado, antes de crear la siguiente clase.

Enunciado
Imagina que una empresa te contrata para que programes un sistema informático que simula un
corral de animales. El analista te proporciona las siguientes indicaciones.

1 ) Crea un interfaz llamado “Animal” que tenga el siguiente método:
public void viveUnaHora(int hora);
El parámetro “hora” es un número entre 0 y 23 que indica la hora del día en la simulación del
corral. Cuando un animal invoca dicho método realiza sus actividades diarias, e.g. comer, dormir,
poner un huevo, etc.

2 ) Crea una clase abstracta “AnimalAbstracto” que implemente el interfaz Animal, y defina como
abstracto el método “viveUnaHora”. Esta clase abstracta tendrá el siguiente atributo privado:
private String nombre;
Implementa métodos públicos para acceder y modificar dicho atributo (getters y setters).

3 ) Crea un clase por cada tipo de animal del corral que extienda la clase “AnimalAbstracto”. Cada
clase tendrá que implementar el método “viveUnaHora”. Los tipos de animales son los siguientes:

– Gallina: Entre las 6h y las 20h, come en las horas múltiplos de 3 y pone un huevo en las horas
múltiplo de seis más uno (i.e. 7, 13, etc.) . Entre las 21h y las 5h duerme.
– Perro: Entre las 8h y las 22h, está despierto. Mientras está despierto come en los múltiplos de
nueve. Mientras está despierto y no come, pasea en las horas pares y descansa en las impares.
– Gato: El gato es más nocturno que los otros dos tipos de animales. En este animal, cada
estudiante debe tener imaginación e indicar qué hace en las diferentes horas teniendo en cuenta
su nocturnidad.
Cada clase deberá implementar el método “viveUnaHora”, de tal forma que si el animal está
haciendo algo en la hora del día pasado por parámetro muestre por pantalla lo siguiente:
El/La <tipo-animal> <nombre> está <acción>.

Por ejemplo, podría mostrarse:
El perro Blacky está comiendo.

IMPORTANTE: Las operaciones deben realizar comparaciones con el operador módulo “%”. No se
puede comparar directamente con un número. Por ejemplo, en el caso de que un animal realice una
acción en los múltiplos de 4, se utilizará:
if ( hora%4==0)
No vale utilizar comparaciones de igualdad con números de hora concretos, como por ejemplo:
if (hora==4 || hora==8 || ...)
4 ) Crea la clase “Corral”. Esta tendrá un atributo privado con el siguiente array:

Animal [] animales;


Además, deberá tener un método constructor que inicialice este array con los siguientes animales:
– Una gallina llamada Federica
– Una gallina llamada Manuela
– Un perro llamado Blacky
– Un perro llamado Dirty
– Un gato llamado Tonet

Crea el siguiente método en dicha clase:
public void simulaUnDía()

Para cada hora del día (entre 0 y 23), dicho método debe mostrar la hora del día. Para cada hora,
también debe recorrer el array de “animales”, invocando el método “viveUnaHora” de cada animal.
Por tanto, el resultado de la ejecución debería ser lago parecido al siguiente:
---------- 0 h ---------------------
La gallina Federico está durmiendo.
La gallina Manuela está durmiendo.
El perro Blacky está durmiendo.
...
---------- 1 h ---------------------
...
---------- 2 h ---------------------
...
PUNTO PARA EL APRENDIZAJE: Observa que se está aplicando polimorfismo dinámico, dado
que se invocando método “viveUnaHora” sobre los objetos polimórficos que representan animales,
y cada uno actúa de forma diferente.
5 ) Desde una clase llamada Test con una función “main”, crea un objeto de la clase Corral e invoca
el método “simulaUnDia”. Prueba que todo funciona correctamente.
