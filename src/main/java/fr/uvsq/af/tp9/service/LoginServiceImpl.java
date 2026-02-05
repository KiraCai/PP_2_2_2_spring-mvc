package fr.uvsq.af.tp9.service;
import fr.uvsq.af.tp9.entity.Login;
import fr.uvsq.af.tp9.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository repo;

    @Override
    public void save(Login login) {
        repo.save(login);
    }

    @Override
    public List<Login> listAll() {
        return (List<Login>) repo.findAll();
    }

    @Override
    public Login get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
