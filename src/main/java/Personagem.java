import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Personagem {
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String nome;
	@JsonProperty("status")
	private String status;

	@Override
	public String toString() {
		return "Personagem{" +
			"id=" + id +
			", nome='" + nome + '\'' +
			", status='" + status + '\'' +
			'}';
	}
}
