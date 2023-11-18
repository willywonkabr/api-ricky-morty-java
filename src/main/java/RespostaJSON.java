import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RespostaJSON {
	int id;
	List<Personagem> personagem;
}
