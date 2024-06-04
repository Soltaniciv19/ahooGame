package student.examples;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Data
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickname;
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }
}
