package school.sptech.lcsports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.sptech.lcsports.domain.Postagem;
import school.sptech.lcsports.domain.Usuario;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
    List<Postagem> findTop10ByOrderByDataPostagem();

    List<Postagem> findAllByUsuario(Usuario usuario);
}