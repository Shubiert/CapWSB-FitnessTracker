package pl.wsb.fitnesstracker.event;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;

@Entity
@Table(name = "Event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false,name="Name")
    private String Name;

    @Column(nullable = true,name="Description")
    private String Description;

    @Column(nullable = false,name="startTime")
    private Date StartTime;

    @Column(nullable = true,name="endTime")
    private Date EndTime;

    @Column(nullable = true,name="Country")
    private String Country;

    @Column(nullable = true,name="City")
    private String City;

    public Event(String name, String description, Date startTime, Date endTime, String country, String city) {
        Name = name;
        Description = description;
        StartTime = startTime;
        EndTime = endTime;
        Country = country;
        City = city;

    }
}