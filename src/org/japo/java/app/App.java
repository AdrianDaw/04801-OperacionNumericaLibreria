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
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    //Random
    private static final Random RND = new Random();

    // RANDOM PARA VALORES
    public static final int MAX = 10;
    public static final int MIN = 0;
    
    // RANGO PARA TIPO DE OPERACION
    public static final int MAX_OP = 7;
    public static final int MIN_OP = 0;
    
    // CONSTANTES
    public static final int N1;
    public static final int N2;
    public static final int OP;

    static {
        N1 = RND.nextInt(MAX - MIN + 1) + MIN;
        N2 = RND.nextInt(MAX - MIN + 1) + MIN;
        OP = RND.nextInt(MAX_OP - MIN_OP + 1) + MIN_OP;
    }

    public final void launchApp() {
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        System.out.printf("Número 1 ....: %d%n", N1);
        System.out.printf("Número 2 ....: %d%n", N2);
        System.out.printf(UtilesPrimitivos.operar(N1, N2, OP));
    }
}

