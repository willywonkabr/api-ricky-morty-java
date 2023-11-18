import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsumoApi {
	public static void main(String[] args) throws IOException {
		URL urlObj = new URL("https://rickandmortyapi.com/api/character/1");
		HttpURLConnection conexao = (HttpURLConnection)urlObj.openConnection();
		conexao.setRequestMethod("GET");
		int responseCode = conexao.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();


			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			} in .close();

			ObjectMapper objectMapper = new ObjectMapper();
		/*	RespostaJSON respostaJSON = objectMapper.readValue(response.toString(), Personagem.class);
			for (Personagem personagem : respostaJSON.getPersonagem()){
				System.out.println(personagem);
			}*/
			Personagem personagem = objectMapper.readValue(response.toString(), Personagem.class);
			System.out.println(personagem);

		} else {
			System.out.println("GET request not worked");
		}

	}
}
