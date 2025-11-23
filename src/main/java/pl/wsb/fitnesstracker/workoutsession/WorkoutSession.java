package pl.wsb.fitnesstracker.workoutsession;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: Define the Event entity with appropriate fields and annotations

@Entity
@Table(name = "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private int id;

    @Column(name = "training_id", nullable = false)
    int trainingId;

    @Column(name = "timestamp", nullable = false)
    String timestamp;

    @Column(name = "start_latitude", nullable = false)
    double startLatitude;

    @Column(name = "start_longitude", nullable = false)
    double startLongitude;

    @Column(name = "end_latitude", nullable = false)
    double endLatitude;

    @Column(name = "end_longitude", nullable = false)
    double endLongitude;

    @Column(name = "altitude", nullable = false)
    double altitude;
}
