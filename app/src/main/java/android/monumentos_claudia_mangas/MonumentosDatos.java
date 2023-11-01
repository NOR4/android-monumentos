package android.monumentos_claudia_mangas;

import java.util.ArrayList;
import java.util.List;

public class MonumentosDatos {
    public static List<Monumento> listaMonumentos() {
        List<Monumento> monumentos = new ArrayList<>();


        monumentos.add(new Monumento(
                "Monasterio de San Lorenzo de El Escorial",
                "España",
                "San Lorenzo de El Escorial",
                1584,
                new Arquitecto("Juan Bautista de Toledo", "masculino", "España"),
                "El Monasterio de San Lorenzo de El Escorial es un complejo renacentista...",
                true,
                "Renacimiento español",
                33,
                R.drawable.escorial // Reemplaza con la URL de la imagen
        ));
        monumentos.add(new Monumento(
                "Palacio Real de Aranjuez",
                "España",
                "Aranjuez",
                0, // Año desconocido
                new Arquitecto("Varios arquitectos y diseñadores", "varios", "varios"),
                "El Palacio Real de Aranjuez es un ejemplo sobresaliente de la arquitectura barroca y neoclásica...",
                true,
                "Arquitectura barroca y neoclásica",
                22,
                R.drawable.aranjuez // Reemplaza con la URL de la imagen
        ));

        monumentos.add(new Monumento(
                "Universidad de Alcalá de Henares",
                "España",
                "Alcalá de Henares",
                1499,
                new Arquitecto("Varios arquitectos a lo largo de los siglos", "varios", "varios"),
                "La Universidad de Alcalá de Henares es un importante centro de la cultura renacentista en España...",
                true,
                "Renacimiento español",
                0, // Altura varía según los edificios
                R.drawable.alcala // Reemplaza con la URL de la imagen
        ));

        monumentos.add(new Monumento(
                "Monasterio de las Descalzas Reales",
                "España",
                "Madrid",
                1559,
                new Arquitecto("No se atribuye a un arquitecto específico", "varios", "varios"),
                "El Monasterio de las Descalzas Reales es un convento de clausura que alberga una rica colección de arte...",
                false,
                "Arquitectura renacentista",
                0, // La estructura no es particularmente alta
                R.drawable.descalzas // Reemplaza con la URL de la imagen
        ));

        return monumentos;
    }
}
