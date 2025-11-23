package pl.wsb.fitnesstracker.training.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.internal.ActivityType;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;
@Entity
@Table(name = "trainings")
@ToString
@Getter
public class Trainings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)

    private User user_id;
    @Column(name = "startTime", nullable = false)
    private Date start_time;
    @Column(name = "end_time", nullable = false)
    private Date end_time;
    @Column(name = "activityType", nullable = false)
    private ActivityType activity_type;
    @Column(name = "distance", nullable = false)
    private double distance;
    @Column(name = "averageSpeed", nullable = false)
    private double average_speed;

    public Trainings(
            final User user_id,
            final Date startTime,
            final Date endTime,
            final ActivityType activity_type,
            final double distance,
            final double average_speed) {
        this.id = id;
        this.user_id = user_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.activity_type = activity_type;
        this.distance = distance;
        this.average_speed = average_speed;
    }
}