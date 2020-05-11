package ie.gmit;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getCar(), user);
            STORAGE.put(user.getMotorcycle(), user);
            STORAGE.put(user.getTrailer(), user);

        }
    }

    public User getUser(String motocycle){
        synchronized (STORAGE){
            return STORAGE.get(motocycle);
        }
    }

    public User getUser1(String car) {
        synchronized (STORAGE) {
            return STORAGE.get(car);
        }

    }

    public User getUser2(String trailer) {
        synchronized(STORAGE) {
            return STORAGE.get(trailer);
        }

    }

}
