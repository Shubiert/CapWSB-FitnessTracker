package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.api.Training;

import java.sql.Timestamp;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "Workout_Session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long Id;

    @OneToOne
    @JoinColumn(name = "training_id", nullable = false)
    private Training TrainingId;

    @Column(name = "timestamp")
    private Timestamp Timestamp;

    @Column(name = "startLatitude")
    private double StartLatitude;

    @Column(name = "startLongitude")
    private double StartLongitude;

    @Column(name = "endLatitude")
    private double EndLatitude;

    @Column(name = "EndLongitude")
    private double endLongitude;

    @Column(name = "Altitude")
    private double altitude;

    public WorkoutSession(Training trainingId, Timestamp timestamp, double startLatitude, double startLongitude, double endLatitude, double endLongitude, double altitude) {
        this.TrainingId = trainingId;
        this.Timestamp = timestamp;
        this.StartLatitude = startLatitude;
        this.StartLongitude = startLongitude;
        this.EndLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.altitude = altitude;
    }
}
