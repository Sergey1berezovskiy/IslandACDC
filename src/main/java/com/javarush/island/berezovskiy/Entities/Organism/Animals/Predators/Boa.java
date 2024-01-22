package com.javarush.island.berezovskiy.Entities.Organism.Animals.Predators;

import com.javarush.island.berezovskiy.Configs.OrganismConfigs;
import com.javarush.island.berezovskiy.Constants.Constants;

import java.util.concurrent.atomic.AtomicInteger;

public class Boa extends Predator {
    private static final AtomicInteger boaNumber = new AtomicInteger(0);
    public Boa() {
        super();
        maximumCount = OrganismConfigs.MAX_BOA_COUNT_IN_CELL;
        this.name = Constants.BOA;
        maximumStep = OrganismConfigs.MAX_BOA_STEP;
        Boa.boaNumber.incrementAndGet();
    }

    public static AtomicInteger getOrganismNumber() {
        return Boa.boaNumber;
    }
    @Override
    public void incrementOrganismCount() {
        Boa.organismAmount.incrementAndGet();
    }

    @Override
    public void decrementOrganismCount() {
        Boa.organismAmount.decrementAndGet();
    }
}
