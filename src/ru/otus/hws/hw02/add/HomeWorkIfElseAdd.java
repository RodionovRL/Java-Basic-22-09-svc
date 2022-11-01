package ru.otus.hws.hw02.add;

import java.util.Scanner;


public class HomeWorkIfElseAdd {
    public static void main(String[] args) {
        int numCorrectAnswers = 0;
        int numWrongAnswers = 0;

        String[][][] questionsAnswers = new String[][][]{
                {{"Не лает, не кусает, а в дом не пускает"},
                        {"Кошка", "Замок", "Дверь", "Собака"},
                            {"2"}
                },
                {{"2 + 2 * 2 = "},
                        {"8", "4", "10", "6"},
                            {"4"}
                },
                {{"Два брюшка, четыре ушка"},
                        {"свинья", "толстяк на коне", "подушка", "ножницы"},
                            {"3"}
                },
                {{"Ёжики дома сидели, песню дружно они запели. Первый ёжик: \" Фыр-фыр-фыр \". Второй ёжик: \"Хыр-Хыр-Хыр\". Третий ёжик \"Цир-цир-цир\". Как запел четвёртый ёжик?"},
                        {"Арр - арр - арр", "Урр - урр - урр", "Ирр - ирр - ирр", "Чирр - Чирр - Чирр"},
                            {"4"}
                }
        };

        Scanner answer = new Scanner(System.in);

        for (int i = 0; i < questionsAnswers.length; i++){
            System.out.println(questionsAnswers[i][0][0]);
            int numberAnswer = 0;
            for (String answerPrint : questionsAnswers[i][1]) {
                System.out.println(++numberAnswer + ": " + answerPrint + ";");
            }
            //scanAnswerOk();
            if (scanAnswerOk() == Integer.parseInt(questionsAnswers[i][2][0])) {
                numCorrectAnswers++;
            } else {
                numWrongAnswers++;
            }
        }

        System.out.println("Правильных ответов: " + numCorrectAnswers);
        System.out.println("Ошибок:" + numWrongAnswers);


    }
    private static int scanAnswerOk() {
        Scanner scanAnswer = new Scanner(System.in);
        boolean isAnswerOk = false;
        int answer = 0;
        System.out.println("Ваш вариант ответа");
        while (!isAnswerOk) {
            System.out.print("(введите цифру от 1 до 4): ");
            answer = scanAnswer.nextInt();
            isAnswerOk = (answer == 1 || answer == 2 || answer == 3 || answer == 4);
        }

        return answer;
    }
}