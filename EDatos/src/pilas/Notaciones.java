/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author LLira
 */
public class Notaciones {

    public static String convertirInToPost(String infija) {
        String postfija = "";
        Pila stack = new Pila(20);
        char letra = ' ';
        char letra2 = ' ';
        for (int i = 0; i < infija.length(); i++) {
            letra = infija.charAt(i);
            switch (letra) {
                case '(':
                    stack.push(letra);
                    break;
                case ')':
                    do {
                        letra = stack.pop();
                        if (letra != '(') {
                            postfija += letra + " ";
                        }
                    } while (letra != '(');
                    break;
                case '^':
                    stack.push(letra);
                    break;
                case '*':
                case '/':
                    if (stack.isEmpty()) {
                        stack.push(letra);
                    } else {
                        do {
                            letra2 = stack.seek();
                            if (letra2 == '^' || letra2 == '*' || letra2 == '/') {
                                letra2 = stack.pop();
                                postfija += letra2 + " ";
                            }
                        } while (letra2 == '^' || letra2 == '*' || letra2 == '/');
                        stack.push(letra);
                    }
                    break;
                case '+':
                case '-':
                    if (stack.isEmpty()) {
                        stack.push(letra);
                    } else {
                        do {
                            letra2 = stack.seek();
                            if (letra2 == '^' || letra2 == '*' || letra2 == '/' || letra2 == '+' || letra2 == '-') {
                                letra2 = stack.pop();
                                postfija += letra2 + " ";
                            }
                        } while (letra2 == '^' || letra2 == '*' || letra2 == '/' || letra2 == '+' || letra2 == '-');
                        stack.push(letra);
                    }
                    break;
                default: //Los operandos
                    postfija += letra + " ";
            }//End switch   
        }
        while (!stack.isEmpty()) {
            letra = stack.pop();
            postfija += letra + " ";
        }
        return postfija;
    }

}//End
