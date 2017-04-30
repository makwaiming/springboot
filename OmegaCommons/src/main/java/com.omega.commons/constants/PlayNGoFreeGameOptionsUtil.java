package com.omega.commons.constants;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by songleo on 2016-05-18.
 */
public class PlayNGoFreeGameOptionsUtil {
    private static final Map<String, PlayNGoFreeGame> playNGoFreeGameMap = new HashMap<String, PlayNGoFreeGame>() {
        {
            put("40", new PlayNGoFreeGame("40", "Jolly Roger",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("43", new PlayNGoFreeGame("43", "Fruit Bonanza",
                    new String[]{"1","2","3","4","5","6","7","8","9"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.10"})
            );
            put("193", new PlayNGoFreeGame("193", "Cats and Cash",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("194", new PlayNGoFreeGame("194", "Cops'n'Robbers",
                    new String[]{"1","2","3","4","5","6","7","8","9"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("196", new PlayNGoFreeGame("196", "Fortune Teller",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("197", new PlayNGoFreeGame("197", "Photo Safari",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("198", new PlayNGoFreeGame("198", "Space Race",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("199", new PlayNGoFreeGame("199", "5x Magic",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.10","0.20","0.25","0.50","1.00"})
            );
            put("200", new PlayNGoFreeGame("200", "Irish Gold",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.10","0.20","0.25","0.50","1.00"})
            );
            put("225", new PlayNGoFreeGame("225", "Enchanted Meadow",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("237", new PlayNGoFreeGame("237", "Riches of RA",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("238", new PlayNGoFreeGame("238", "Dragon Ship",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("241", new PlayNGoFreeGame("241", "Pearl Lagoon",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("242", new PlayNGoFreeGame("242", "Jewel Box",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("243", new PlayNGoFreeGame("243", "Aztec Idols",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("244", new PlayNGoFreeGame("244", "Gunslinger",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("245", new PlayNGoFreeGame("245", "Myth",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("246", new PlayNGoFreeGame("246", "Gold Trophy 2",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("250", new PlayNGoFreeGame("250", "Wild Blood",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("251", new PlayNGoFreeGame("251", "Leprechaun goes Egypt",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("253", new PlayNGoFreeGame("253", "Ninja Fruits",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("257", new PlayNGoFreeGame("257", "Rage to Riches",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("259", new PlayNGoFreeGame("259", "Enchanted Crystals",
                    new String[]{"1"},
                    new String[]{"10"},
                    new String[]{"0.02","0.10","0.20","1.00","5.00"})
            );
            put("262", new PlayNGoFreeGame("262", "Energoonz",
                    new String[]{"20"},
                    new String[]{"1"},
                    new String[]{"0.01","0.05","0.10","0.50","2.00"})
            );
            put("277", new PlayNGoFreeGame("277", "Chinese New Year",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("278", new PlayNGoFreeGame("278", "Lady of Fortune",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("282", new PlayNGoFreeGame("282", "Pearls of India",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("283", new PlayNGoFreeGame("283", "mysteryjoker",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.10","0.20","0.30","0.40","0.60","1.00","2.00","5.00",
                            "10.00","20.00"})
            );
            put("284", new PlayNGoFreeGame("284", "Crazy Cows",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("285", new PlayNGoFreeGame("285", "Golden Ticket",
                    new String[]{"1"},
                    new String[]{"20"},
                    new String[]{"0.01","0.05","0.10","0.50","2.00"})
            );
            put("286", new PlayNGoFreeGame("286", "GEMiX",
                    new String[]{"1"},
                    new String[]{"10"},
                    new String[]{"0.05","0.07","0.10","0.15","0.20","0.50","1.00",
                            "2.00","5.00","10.00"})
            );
            put("287", new PlayNGoFreeGame("287", "Tower Quest",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("288", new PlayNGoFreeGame("288", "Merry Xmas",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("290", new PlayNGoFreeGame("290", "Golden Legend",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
                            "31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.04","0.06","0.08","0.10","0.12","0.16","0.20","0.30","0.40"})
            );
            put("291", new PlayNGoFreeGame("291", "Pimped",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00","1.50","2.00"})
            );
            put("292", new PlayNGoFreeGame("292", "Spin Party",
                    new String[]{"10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00","1.50","2.00"})
            );
            put("293", new PlayNGoFreeGame("293", "Easter Eggs",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("294", new PlayNGoFreeGame("294", "Wild North",
                    new String[]{"1"},
                    new String[]{"20"},
                    new String[]{"0.01","0.02","0.05","0.10","0.15","0.20","0.25","0.30","0.40","0.50","1.00","2.50"})
            );
            put("297", new PlayNGoFreeGame("297", "Eye of the Kraken",
                    new String[]{"8"},
                    new String[]{"10"},
                    new String[]{"0.02","0.05","0.10","0.15","0.20","0.50","1.00",
                            "2.00","5.00","10.00"})
            );
            put("298", new PlayNGoFreeGame("298", "Royal Masquerade",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00","1.50","2.00"})
            );
            put("300", new PlayNGoFreeGame("300", "Cloud Quest",
                    new String[]{"1"},
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"0.01","0.05","0.10","0.20","0.30","0.50","0.75","1.00","2.00","4.00"})
            );
            put("301", new PlayNGoFreeGame("301", "Aztec Princess",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("302", new PlayNGoFreeGame("302", "Wizard of Gems",
                    new String[]{"20"},
                    new String[]{"1"},
                    new String[]{"0.01","0.02","0.05","0.10","0.15","0.20","0.25","0.30","0.40","0.50","1.00","2.50"})
            );
            put("303", new PlayNGoFreeGame("303", "Grim Muerto",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("304", new PlayNGoFreeGame("304", "Samba Carnival",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("305", new PlayNGoFreeGame("305", "Happy Halloween",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
                            "31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.04","0.06","0.08","0.10"})
            );
            put("307", new PlayNGoFreeGame("307", "Fire Joker",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.30","0.40","0.60","1.00","2.00","5.00","10.00","20.00"})
            );
            put("309", new PlayNGoFreeGame("309", "Xmas Joker",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.10","0.20","0.30","0.40","0.60","1.00","2.00","5.00"})
            );
            put("310", new PlayNGoFreeGame("310", "Book of Dead",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00","2.00"})
            );
            put("311", new PlayNGoFreeGame("311", "Sails of Gold",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00"})
            );
            put("312", new PlayNGoFreeGame("312", "Golden Caravan",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00"})
            );

            // mobile
            put("100040", new PlayNGoFreeGame("100040", "Jolly Roger Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10", "11", "12", "13", "14", "15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25", "0.50","1.00"})
            );
            put("100196", new PlayNGoFreeGame("100196", "Fortune Teller Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100197", new PlayNGoFreeGame("100197", "Photo Safari Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100198", new PlayNGoFreeGame("100198", "Space Race Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100199", new PlayNGoFreeGame("100199", "5x Magic Mobile",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.10","0.20","0.25", "0.50","1.00"})
            );
            put("100200", new PlayNGoFreeGame("100200", "Irish Gold Mobile",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.10","0.20","0.25", "0.50","1.00"})
            );
            put("100225", new PlayNGoFreeGame("100225", "Enchanted Meadow Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10", "11", "12", "13", "14", "15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100237", new PlayNGoFreeGame("100237", "Riches of RA Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10", "11", "12", "13", "14", "15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100238", new PlayNGoFreeGame("100238", "Dragon Ship Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10", "11", "12", "13", "14", "15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100241", new PlayNGoFreeGame("100241", "Pearl Lagoon Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100242", new PlayNGoFreeGame("100242", "Jewel Box Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100243", new PlayNGoFreeGame("100243", "Aztec Idols Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100245", new PlayNGoFreeGame("100245", "Myth Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100246", new PlayNGoFreeGame("100246", "Gold Trophy 2 Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100250", new PlayNGoFreeGame("100250", "Wild Blood Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100251", new PlayNGoFreeGame("100251", "Leprechaun goes Egypt Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100253", new PlayNGoFreeGame("100253", "Ninja Fruits Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100275", new PlayNGoFreeGame("100275", "Rage to Riches Mobile",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100257", new PlayNGoFreeGame("100257", "Rage to Riches Mobile",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100259", new PlayNGoFreeGame("100259", "Enchanted Crystals Mobile",
                    new String[]{"1"},
                    new String[]{"10"},
                    new String[]{"0.02","0.10","0.20","1.00","5.00"})
            );
            put("100262", new PlayNGoFreeGame("100262", "Energoonz Mobile",
                    new String[]{"20"},
                    new String[]{"1"},
                    new String[]{"0.01","0.05","0.10","0.50","2.00"})
            );
            put("100277", new PlayNGoFreeGame("100277", "Chinese New Year Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100278", new PlayNGoFreeGame("100278", "Lady of Fortune Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100282", new PlayNGoFreeGame("100282", "Pearls of India Mobile",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("100283", new PlayNGoFreeGame("100283", "Mystery Joker Mobile",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.10","0.20","0.30","0.40","0.60","1.00","2.00","5.00","10.00","20.00"})
            );
            put("100284", new PlayNGoFreeGame("100284", "Crazy Cows Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100285", new PlayNGoFreeGame("100285", "Golden Ticket Mobile",
                    new String[]{"1"},
                    new String[]{"20"},
                    new String[]{"0.01","0.05","0.10","0.50","2.00"})
            );
            put("100286", new PlayNGoFreeGame("100286", "GEMiX Mobile",
                    new String[]{"1"},
                    new String[]{"10"},
                    new String[]{"0.05","0.07","0.10","0.15","0.20","0.50","1.00","2.00","5.00","10.00"})
            );
            put("100287", new PlayNGoFreeGame("100287", "Tower Quest Mobile",
                    new String[]{"20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("100288", new PlayNGoFreeGame("100288", "Merry Xmas Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100290", new PlayNGoFreeGame("100290", "Golden Legend Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
                            "31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.04","0.06","0.08","0.10","0.12","0.16","0.20","0.30","0.40"})
            );
            put("100291", new PlayNGoFreeGame("100291", "Pimped Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00","1.50","2.00"})
            );
            put("100292", new PlayNGoFreeGame("100292", "Spin Party Mobile",
                    new String[]{"10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00","1.50","2.00"})
            );
            put("100293", new PlayNGoFreeGame("100293", "Easter Eggs Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25","0.50","1.00"})
            );
            put("100294", new PlayNGoFreeGame("100294", "Wild North Mobile",
                    new String[]{"1"},
                    new String[]{"20"},
                    new String[]{"0.01","0.02","0.05","0.10","0.15","0.20","0.25","0.30","0.40","0.50","1.00","2.50"})
            );
            put("100297", new PlayNGoFreeGame("100297", "Eye of the Kraken Mobile",
                    new String[]{"8"},
                    new String[]{"10"},
                    new String[]{"0.02","0.05","0.10","0.15","0.20","0.50","1.00","2.00","5.00","10.00"})
            );
            put("100298", new PlayNGoFreeGame("100298", "Royal Masquerade Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.05","0.10","0.20","0.30","0.50","0.75","1.00","2.00","4.00"})
            );
            put("100300", new PlayNGoFreeGame("100300", "Cloud Quest Mobile",
                    new String[]{"1"},
                    new String[]{"10"},
                    new String[]{"0.01","0.02","0.05","0.10","0.15","0.20","0.25","0.30","0.40","0.50","1.00","2.50"})
            );
            put("100302", new PlayNGoFreeGame("100302", "Wizard of Gems Mobile",
                    new String[]{"20"},
                    new String[]{"1"},
                    new String[]{"0.01","0.02","0.05","0.10","0.15","0.20","0.25","0.30","0.40","0.50","1.00","2.50"})
            );
            put("100303", new PlayNGoFreeGame("100303", "Grim Muerto Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100304", new PlayNGoFreeGame("100304", "Samba Carnival Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.25"})
            );
            put("100305", new PlayNGoFreeGame("100305", "Happy Halloween Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30",
                            "31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.04","0.06","0.08","0.10"})
            );
            put("100307", new PlayNGoFreeGame("100307", "Fire Joker Mobile",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.01","0.02","0.05","0.10","0.20","0.30","0.40","0.60","1.00","2.00","5.00","10.00","20.00"})
            );
            put("100309", new PlayNGoFreeGame("100309", "Xmas Joker Mobile",
                    new String[]{"5"},
                    new String[]{"1"},
                    new String[]{"0.60","1.00","2.00","5.00"})
            );
            put("100310", new PlayNGoFreeGame("100310", "Book of Dead Mobile",
                    new String[]{"1","2","3","4","5"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00","2.00"})
            );
            put("100311", new PlayNGoFreeGame("100311", "Sails of Gold Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00"})
            );
            put("100312", new PlayNGoFreeGame("100312", "Golden Caravan Mobile",
                    new String[]{"1","2","3","4","5","6","7","8","9","10"},
                    new String[]{"1","2","3","4","5"},
                    new String[]{"0.01","0.02","0.03","0.04","0.05","0.10","0.20","0.50","1.00"})
            );
        }
    };


    public void PlayNGoFreeGameOptionsUtil() {

    }

    public static Map<String, String> getPlayNGoFreeGameGameList() {
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, PlayNGoFreeGame> entry : playNGoFreeGameMap.entrySet()) {
            String gameId = entry.getKey();
            PlayNGoFreeGame playNGoFreeGame = entry.getValue();
            options.put(gameId, playNGoFreeGame.getGameName());
        }

        return options;
    }

    public static Map<String, String> getPlayNGoFreeGameCoinsList() {
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, PlayNGoFreeGame> entry : playNGoFreeGameMap.entrySet()) {
            String gameId = entry.getKey();
            PlayNGoFreeGame playNGoFreeGame = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : playNGoFreeGame.getCoins()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

    public static Map<String, String> getPlayNGoFreeGameLinesList() {
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, PlayNGoFreeGame> entry : playNGoFreeGameMap.entrySet()) {
            String gameId = entry.getKey();
            PlayNGoFreeGame playNGoFreeGame = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : playNGoFreeGame.getLines()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

    public static Map<String, String> getPlayNGoFreeGameDenominationsList() {
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, PlayNGoFreeGame> entry : playNGoFreeGameMap.entrySet()) {
            String gameId = entry.getKey();
            PlayNGoFreeGame playNGoFreeGame = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : playNGoFreeGame.getDenominations()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

}
