# Ejercicios22-23
## Ejercicios Progra II 22-23

### 1.	Interpretación.

#### En qué consiste la recursión

Se define como la capacidad de crear funciones que llamen a otras funciones, evitando el uso de bucles y otras sentencias iterativas. (subprogramas que se invocan a sí mismos).

Se debe cumplir:
-	La llamada recursiva depende del cumplimiento de una condición, condición de recursión.
-	Debe definir una solución directa, no recursiva, para el caso base y esta ha de ser correcta. Esta solución se ejecutará cuando no se cumpla la condición de recursión.
-	La lógica recursiva con la que se define la solución debe ser correcta.
-	Cada llamada debe resolver un problema más pequeño, o más sencillo, de modo que tras un número finito de llamadas la condición de recursión cambie de valor.

Demostración mediante inducción:
-	Es cierto para un caso base
-	 Si supongo que es cierto para un valor n, puedo demostrar que se cumple para n +1

#### En qué consisten los algoritmos iterativos.

Los algoritmos iterativos resuelven los problemas mediante la repetición de bloques de sentencias. Construyen soluciones mediante cambios de estado en la memoria, resultantes de las sentencias de asignación.

Estructuras:
-	Asignaciones
-	Bloques de sentencias, ejecutadas en secuencia.
-	Estructuras de control condicionadles, y alternativas
-	Estructuras de control repetitivas, o bucles.

*La lógica de resolución de problemas en los algoritmos iterativos se define mediante repetición de instrucciones.


#### En qué consisten las expresiones lambda.

Las expresiones lambda son funciones anónimas, es decir, funciones que no necesitan una clase. El operador lambda (->) separa la declaración de parámetros de la declaración del cuerpo de la función.

Las expresiones lambda son un método sin declaración, es decir, sin modificadores de acceso, que devuelve un valor y un nombre. Permiten escribir un método y utilizarlo inmediatamente. Esto es útil en el caso de una única llamada a un método, ya que permite reducir el tiempo de declarar y escribir el método sin tener que crear una clase.

*Las expresiones Lambda definen la regla de correspondencia entre unos argumentos y un resultado.

Aplicabilidad:
-	Son un mecanismo sencillo y potente de definir comportamiento, u objetos, no reutilizables, que solamente se emplean una vez. Reducen notablemente la cantidad de código.
-	Se usan a menudo como argumentos que se pasan a funciones de orden superior, por ejemplo, un comparador para ordenar un contenedor. Permiten pasar comportamiento como un parámetro

Sintaxis:
-	El cuerpo de Lambda puede lanzar excepciones
-	Lambdas de una sola línea:
     o	No necesita llaves
     o	No necesita una declaración de devolución explícita
-	Las lambdas con un solo parámetro no necesitan paréntesis
-	Las lambdas sin parámetros deben tener corchetes vacíos

Tipos:
-	Productoras: No tienen argumentos
     ()-> Math.random() * 100
-	Consumidoras: No devuelven resultados
     Nombre->System.out.print(“Hola “+nombre)
-	Funciones:  
     o	Operadores Unarios
     (n)->1.0/n
     o	Operadores Binarios
     (x,y)->x<y

     
#### En qué consisten las interfaces funcionales

Son interfaces sin declaración de métodos y campos y se conocen como interfaces vacías. Del mismo modo, las interfaces funcionales son interfaces que tienen un solo método abstracto declarado en ella. [java.util.function]

*Interfaces que definen un único método abstracto.

*Son objetos que encapsulan una función.

*Se le conoce como interfaz funcional a toda aquella interfaz que tenga solamente un método abstracto, es decir puede implementar uno o más métodos default, pero deberá tener forzosamente un único método abstracto. Un método abstracto en una interfaz es un método sin implementar.

## Ejercicio 14
#### -	Averigüe la relación entre la sucesión de Fibonacci y la razón áurea. 

Si divides cualquier número de la serie de Fibonacci entre el número anterior, obtienes la razón áurea.
Es decir, siempre obtienes como resultado un valor cercano a 1.61803.