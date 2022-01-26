package org.example;

@Deprecated
public class CoronaDisinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию. Все вон!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Можете зайти обратно");
    }

    private void disinfect(Room room) {
        System.out.println("Корона изыди!");
    }
}
