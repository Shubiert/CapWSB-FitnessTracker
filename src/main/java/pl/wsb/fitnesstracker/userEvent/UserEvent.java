package pl.wsb.fitnesstracker.userEvent;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.event.Event;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "User_Event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,name = "Id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User User;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event Event;

    @Column(name = "status")
    private boolean Status;

    public UserEvent (User user, Event event, boolean status) {
        this.User = user;
        this.Event = event;
        this.Status = status;
    }
}
