/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class UtilesPrimitivos {
    
    // CONSTANTES DE OPERACION
    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

      
     public static final String operar(double n1, double n2, int op) {
        double result;
        String cadena = "";

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                cadena = String.format("SUMA: La Suma es ......: %d%n",
                        (int) result);
                break;

            case OP_RES:
                result = n1 - n2;
                cadena = String.format("RESTA: La Resta es .....: %d%n",
                        (int) result);
                break;

            case OP_MUL:
                result = n1 * n2;
                cadena = String.format("MULTIPLICACION: El Producto es ..: %d%n",
                        (int) result);
                break;

            case OP_DIV:
                result = n1 / n2;
                cadena = String.format("DIVISION: El Cociente es ..: %.2f%n",
                        result);
                break;

            case OP_MOD:
                result = n1 % n2;
                cadena = String.format("RESTO: El Resto es ......: %.2f%n",
                        result);
                break;

            case OP_MED:
                result = (n1 + n2) / 2;
                cadena = String.format("MEDIA: La Media es ......: %.2f%n",
                        result);
                break;

            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                cadena = String.format("MAYOR: El Mayor es ......: %d%n",
                        (int) result);
                break;

            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                cadena = String.format("MENOR: El Menor es ......: %d%n",
                        (int) result);
                break;
        }
        return cadena;
    }
}