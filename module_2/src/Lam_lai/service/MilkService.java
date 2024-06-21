package Lam_lai.service;

import Lam_lai.model.Milk;
import Lam_lai.repository.IMilkRepository;
import Lam_lai.repository.MilkRepository;

import java.util.List;

public class MilkService implements IMilkService {
    private static final IMilkRepository iMilkRepository = new MilkRepository();


    @Override
    public List<Milk> list() {
        return iMilkRepository.list();
    }

    @Override
    public void findAdd(Milk milk1) {
        iMilkRepository.findAdd();
    }
}
