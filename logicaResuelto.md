# Ejercicios de Java Basico
Repositorio de Ejercicios de Lógica de Programación

## Estos ejercicios se realizan contestando las preguntas, sin código.

### 🧠 Ejercicio 1: Hola usuario

#### Planteamiento:

Quieres que el programa salude al usuario por su nombre.

#### Piensa:

¿Cómo se guarda un texto que el usuario escribe? 
R = Se guarda como texto en una cadena 

¿Cómo se muestra un mensaje por pantalla?
R= System.out.println(); en Java

¿Cómo unir (concatenar) el texto “Hola” con el nombre?
R = Se utiliza un "+"
#### Reto:
Imagina que el usuario escribe “Carlos”.
¿Qué debería mostrar el programa?
R = Primero se tiene que pedir el nombre, luego ese dato
guardarlo en una variable  para luego muestrarlo en pantalla.
### 🧠 Ejercicio 2: Suma de dos números

#### Planteamiento:

El usuario introduce dos números, el programa debe mostrar su suma.

#### Piensa:

¿Qué tipo de datos representan los números?
R = Los números puedes ser enteros o decimales
¿Qué operación matemática debes hacer?
R = Una suma con el operado "+"
¿Cómo mostrar el resultado junto con un mensaje claro?
R = Mostrando el resultado de la suma de los 2 números
que introdujo el usuario con un texto Por ejemplo 
El resultado de la suma de a + b es: 
#### Reto:
Si el usuario escribe 8 y 12, ¿qué resultado esperas que aparezca?
8 + 12 = 20
"La suma es 20” o simplemente 20 o “La suma de 8 y 12 es 20.”
### 🧠 Ejercicio 3: Número par o impar

#### Planteamiento:

Determinar si un número es par o impar.

#### Piensa:

¿Qué significa que un número sea par? (¿qué operación lo demuestra?)
Un número es par si al dividirlo entre 2, el residuo es 0.
número %2 == 0
¿Qué pasa si el número no cumple esa condición?
Si el residuo no es 0, entonces el número es impar.
¿Cómo plantearías la decisión en palabras, antes del código?
Si el número se puede dividir entre 2 exactamente, entonces es par.
Si no se puede dividir exactamente (queda residuo 1), entonces es impar.
#### Reto:
Haz una lista rápida de 5 números y marca cuáles son pares e impares.
¿Cómo lo decides mentalmente?
| Número | ¿Par o Impar? |      Justificación     |
| :----: | :-----------: | :--------------------: |
|    4   |      Par      |  4 ÷ 2 = 2, residuo 0  |
|    7   |     Impar     |  7 ÷ 2 = 3, residuo 1  |
|   10   |      Par      |  10 ÷ 2 = 5, residuo 0 |
|   13   |     Impar     |  13 ÷ 2 = 6, residuo 1 |
|   22   |      Par      | 22 ÷ 2 = 11, residuo 0 |

### 🧠 Ejercicio 4: Mayor de dos números

#### Planteamiento:

El programa debe decir cuál de los dos números es mayor o si son iguales.

#### Piensa:

¿Qué comparaciones necesitas hacer entre los dos valores?
R = Serian comparacio (>, <, ==).
¿Qué resultados posibles existen?
R = Primer número mayo , Segundo número mayor e iguales
¿Qué mensaje mostrarías en cada caso?
Si el primero es mayor → “El primer número es mayor.”
Si el segundo es mayor → “El segundo número es mayor.”
Si son iguales → “Ambos números son iguales.”
#### Reto:
Si tienes los números 10 y 15, ¿qué debería decir el programa?
10 > 15  No
15 > 10  Sí
“El segundo número es mayor.”
| Primer número | Segundo número |     Resultado esperado     |
| :-----------: | :------------: | :------------------------: |
|       10      |       15       | El segundo número es mayor |
|       20      |        5       |  El primer número es mayor |
|       7       |        7       |  Ambos números son iguales |

### 🧠 Ejercicio 5: Tabla de multiplicar

#### Planteamiento:

Mostrar la tabla de multiplicar de un número del 1 al 10.

#### Piensa:

¿Qué patrón sigue una tabla de multiplicar?
R = Sería que n x i (del cual i va de 1 al 10)
¿Qué sucede si el número cambia?
El patrón se mantiene igual, solo cambia el número base (n).
Si en lugar de 4 eliges 6, ahora sería:
6×1, 6×2, 6×3… 6×10.
¿Cómo repetirías una acción varias veces (repetición/loop)?
Usando una repetición o bucle (loop).
Ese bucle hará que i vaya de 1 a 10 y repita el cálculo cada vez:
* Muestra n × i = resultado
* Suma 1 a i
* Repite hasta que i llegue a 10
#### Reto:
Imagina que el número es 4.
Enumera mentalmente: 4×1, 4×2, 4×3... hasta 4×10.
¿Qué notas que se repite?
|  i  | Operación | Resultado |
| :-: | :-------: | :-------: |
|  1  |   4 × 1   |     4     |
|  2  |   4 × 2   |     8     |
|  3  |   4 × 3   |     12    |
|  4  |   4 × 4   |     16    |
|  5  |   4 × 5   |     20    |
|  6  |   4 × 6   |     24    |
|  7  |   4 × 7   |     28    |
|  8  |   4 × 8   |     32    |
|  9  |   4 × 9   |     36    |
|  10 |   4 × 10  |     40    |
* Siempre se multiplica el mismo número (n)
* Por un contador que va del 1 al 10
* Y se repite exactamente 10 veces
### 🧠 Ejercicio 6: Contador del 1 al N

#### Planteamiento:

Mostrar todos los números desde el 1 hasta un número que el usuario indique.

#### Piensa:

¿Qué ocurre si el usuario pone 5?
La programa debe “contar” desde 1 hasta 5, mostrando cada número en orden.
¿Cómo puedes generar una secuencia de números consecutivos?
Usando un contador, que empieza en 1 y se va aumentando de uno en uno hasta llegar al número que dijo el usuario (N).
* Empiezas con el número 1
* Muestras el número
* Le sumas 1
* Se repite mientras el número sea menor o igual a N
¿Qué variable controlaría cuántas veces repites el proceso?
  Una variable que llamaremos, por ejemplo, contador.
  Esta variable se incrementa (+1) cada vez que se repite el paso.
#### Reto:
Hazlo tú: cuenta del 1 al número que quieras, pero imagina que una máquina lo hace.
¿Qué instrucciones necesitaría?
Empieza con contador = 1
¿El contador es menor o igual que 5? Sí
→ Muestra “1”

Suma 1 → contador = 2

¿El contador es menor o igual que 5?  Sí
→ Muestra “2”

Suma 1 → contador = 3

Repite hasta que llegues a 5.

Cuando contador = 6, ya no es menor o igual a 5 
→ Se detiene el conteo.

Resultado final mostrado:
1
2
3
4
5
### 🧠 Ejercicio 7: Suma acumulativa

#### Planteamiento:

Calcular la suma de los números del 1 al N.

#### Piensa:

¿Qué patrón sigue la suma? (1 + 2 + 3 + ... + N)
primero sumas 1, luego 2, luego 3, y así sucesivamente hasta llegar a N.
 Sumea = 1 + 2 + 3..+N
¿Podrías ir sumando número por número?
Sí, puedes usar un acumulador, una variable que va guardando la suma parcial.
Por ejemplo:
* Empiezas con suma = 0
* Se va  agregando cada número:
  suma = suma + número_actual
* Se repite hasta llegar a N.
¿Qué necesitas guardar durante el proceso?
* Un contador (para saber qué número estás sumando).
* Un acumulador (para guardar la suma total hasta ese momento)
#### Reto:
Si N = 5 → 1 + 2 + 3 + 4 + 5 = 15
¿Cómo podrías llegar a ese 15 sin hacer la cuenta completa cada vez?
| Paso | Contador | Operación | Suma acumulada |
| :--: | :------: | :-------: | :------------: |
|   1  |     1    |   0 + 1   |        1       |
|   2  |     2    |   1 + 2   |        3       |
|   3  |     3    |   3 + 3   |        6       |
|   4  |     4    |   6 + 4   |       10       |
|   5  |     5    |   10 + 5  |       15     |

### 🧠 Ejercicio 8: Promedio de tres números

#### Planteamiento:

Calcular el promedio de tres valores numéricos.

#### Piensa:

¿Qué operación define el promedio?
R = Promedio = suma de valores / 3
¿Qué pasos necesitas para calcularlo (sumar → dividir)?
R = Ambos
¿Qué tipo de resultado esperas (entero o decimal)?
R = Pueden ser ambos
#### Reto:
Si tienes 70, 80 y 90, ¿qué promedio obtienes?
R = (70 + 80 + 90) / 3 = 240 / 3 = 80
### 🧠 Ejercicio 9: Calificación aprobatoria

#### Planteamiento:

Decidir si una calificación es aprobatoria o reprobatoria.

#### Piensa:

¿Cuál es el valor mínimo para aprobar? 
* Si nos basamo en la calificación mínima aprobatoria es 60 , en la mayoría de escuelas.
¿Qué comparación necesitas hacer?
Hay que comparar la calificación con 60:
* Si la calificación es mayor o igual a 60, el resultado es “Aprobado”.
* Si es menor que 60, el resultado es “Reprobado”.
¿Cómo expresas el resultado como texto (“Aprobado” o “Reprobado”)?
El programa mostraría un mensaje según el caso:
* “Aprobado” 
* “Reprobado” 
#### Reto:
Si el usuario escribe 59, ¿qué diría tu programa?
¿Y si escribe 60?
| Calificación | Comparación con 60 |    Resultado    |
| :----------: | :----------------: | :-------------: |
|      59      |       59 < 60      |   Reprobado |
|      60      |       60 ≥ 60      |   Aprobado |
|      75      |       75 ≥ 60      |   Aprobado |
|      45      |       45 < 60      |   Reprobado |

* Si la calificación del estudiante es mayor o igual que 60, diré que está aprobado;
de lo contrario, diré que está reprobado.
### 🧠 Ejercicio 10: Conversor de temperatura

#### Planteamiento:

Convertir grados Celsius a Fahrenheit.

#### Piensa:

¿Qué fórmula necesitas aplicar?
R = Fórmula: F = (C × 9/5) + 32
¿Qué pasos seguirías para obtener el resultado?
R = Solmente utilizar la formúla
¿Qué pasa si el usuario ingresa un número negativo?
R = De igual manera sirven los valores negativos
#### Reto:
Si C = 0 → F = (0×9/5)+32 → 32
¿Puedes hacerlo con otro valor, por ejemplo, C=100?
Si C = 100 → F = (100×9/5)+32 = 212