package projetogson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

import com.google.gson.Gson;

public class ProjetoGson {

	public static void main(String[] args) {

		Principal skol = new Principal();
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");

		Gson g = new Gson();
		String json = g.toJson(skol);

		System.out.println(json);

		try {
			FileWriter fw = new FileWriter("/temp/cerveja1.json");
			fw.write(json);
			fw.close();
		} catch (Exception e) {

		}

		try {

			Gson res = new Gson();
			
			Reader br = new BufferedReader(new FileReader("/temp/cerveja1.json"));
			Principal obj = res.fromJson(br, Principal.class);
			System.out.println(obj);

		} catch (Exception e) {

		}
	}
}
