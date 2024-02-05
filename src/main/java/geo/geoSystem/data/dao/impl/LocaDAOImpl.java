package geo.geoSystem.data.dao.impl;

import geo.geoSystem.data.dao.LocaDAO;
import geo.geoSystem.data.entity.Loca;
import geo.geoSystem.repository.LocaRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocaDAOImpl implements LocaDAO {
    @Autowired
    LocaRepository locaRepository;
    private final Logger LOGGER = LoggerFactory.getLogger(LocaDAOImpl.class);

    @Override
    public Loca saveLoca(Loca loca) {
        LOGGER.info("[saveLoca] loca 정보 저장. locaId : {}", loca.getLocaId());
        Loca loca1 = locaRepository.save(loca);
        LOGGER.info("[saveLoca] loca 정보 저장완료. locaId : {}", loca1.getLocaId());
        return loca1;
    }

    @Override
    public List<Loca> getAllLocas() {
       return locaRepository.findAll();
    }


}
