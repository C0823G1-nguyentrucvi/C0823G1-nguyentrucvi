package Lam_lai.Controller;

import Lam_lai.model.Milk;
import Lam_lai.service.IMilkService;
import Lam_lai.service.MilkService;

import java.util.List;

public class MilkController {
    private static final IMilkService iMilkService = new MilkService();


    public List<Milk> list() {
        return iMilkService.list();
    }

    public void findAdd(Milk milk1) {
        iMilkService.findAdd(milk1);
    }
}
