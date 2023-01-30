package org.example.lesson2.game;

public class Game {

    /**
     * 0. Переварить весь код.
     * 1. В пакете org.example.lesson2.game проделать такую же процедуру, как и с WallAdapter, для остальных препятствий.
     * 2. Общие куски для препятствий вынести в какой-то базовый класс AbstractObstacle.
     * 3*. Придумать какой-то свой тип препятствия.
     * Проанализировать, что принципиально изменилось в структуре проекта при добавлении нового типа.
     *
     */
    public static void main(String[] args) {
        // Соревнования между участниками
        // Есть полоса препятствий, которая состоит из дорожки (с длиной) и стены (с высотой).
        // Участники преодолевают препятствия по очереди.

        Participant[] participants = createParticipants();
        Obstacle[] obstacles = createObstacles();

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean overcome = obstacle.overcome(participant);
                if (overcome) {
                    System.out.println(participant.getName() +
                            " преодолел препятствие \"" + obstacle.type() + "\"");
                }
            }
        }

    }

    private static Participant[] createParticipants() {
        return new Participant[] {
                new Cat("Cat-1", 10, 2),
                new Cat("Cat-2", 8, 5),
                new Human("Human-1", 8, 5, 3),
                new Cheater("Cheater")
        };
    }

    private static Obstacle[] createObstacles() {
        return new Obstacle[] {
                new Road(9),
                new SwimmingPool(4),
//                new Wall(4)
        };
    }

}
