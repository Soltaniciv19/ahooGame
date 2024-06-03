package student.examples;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickname;
    private int score;

}
