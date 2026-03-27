package cl.biblioteca.bibliotecaduoc.services;

import cl.biblioteca.bibliotecaduoc.model.Libro;
import cl.biblioteca.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "Producto eliminado";
    }

    public int totalLibro() {
        return libroRepository.obtenerLibros().size();
    }

    public int totalLibroV2() {
        return libroRepository.totalLibros();
    }

}
