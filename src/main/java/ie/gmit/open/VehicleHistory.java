package ie.gmit.open;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VehicleHistory {
    public static class Name {

        private LocalDateTime begin;

        private long duration;

        private Long vehicleId;

        public Name(Long vehicleId, LocalDateTime begin, long duration) {
            this.begin = begin;
            this.duration = duration;
            this.vehicleId = vehicleId;
        }

        /**
         * @return the begin
         */
        public LocalDateTime getBegin() {
            return begin;
        }

        /**
         * @return the duration
         */
        public long getDuration() {
            return duration;
        }

        /**
         * @return the person
         */
        public Long getVehicleId() {
            return vehicleId;
        }

    }

    private static final Map<Long, List<Name>> NAMES = new HashMap<>();

    public synchronized static List<Name> getCurrentCalls(Long subscriberId) {
        if(!NAMES.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return NAMES.get(subscriberId);
    }

    public synchronized static void addSession(Long vehicleId, LocalDateTime begin, long duration) {
        List<Name> names;
        if(!NAMES.containsKey(vehicleId)) {
            names = new LinkedList<>();
            NAMES.put(vehicleId, names);
        } else {
            names = NAMES.get(vehicleId);
        }
        names.add(new Name(vehicleId, begin, duration));
    }

}
