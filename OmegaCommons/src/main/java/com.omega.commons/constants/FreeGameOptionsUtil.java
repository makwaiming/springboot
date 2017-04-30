package com.omega.commons.constants;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by songleo on 2016-06-30.
 */
public class FreeGameOptionsUtil {
    private static final Map<String, FreeGameInfo> playson_freeGameInfoMap = new HashMap<String, FreeGameInfo>() {
        {
            put("alice_c", new FreeGameInfo("alice_c", "Alice in Wonderslots",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("aquatica_c", new FreeGameInfo("aquatica_c", "Aquatica",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("bumper_crop", new FreeGameInfo("bumper_crop", "Bumper Crop",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                            "21", "22", "23", "24", "25", "26", "27"},
                    null,
                    null)
            );
            put("draculas_family_c", new FreeGameInfo("draculas_family_c", "Dracula's Family",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"},
                    null,
                    null)
            );
            put("eastern_delights_c", new FreeGameInfo("eastern_delights_c", "Eastern Delights",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("fruits_of_the_nile_c", new FreeGameInfo("fruits_of_the_nile_c", "Fruits of the Nile",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("fruits_n_stars_c", new FreeGameInfo("fruits_n_stars_c", "Fruits'n'Stars",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("happy_jungle_deluxe_c", new FreeGameInfo("happy_jungle_deluxe_c", "Happy Jungle Deluxe",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("juice_and_fruits_c", new FreeGameInfo("juice_and_fruits_c", "Juice'n'Fruits",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    null,
                    null)
            );
            put("lucky_pirates_c", new FreeGameInfo("lucky_pirates_c", "Lucky Pirates",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("lucky_reels_c", new FreeGameInfo("lucky_reels_c", "Lucky Reels",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("magic_forest_c", new FreeGameInfo("magic_forest_c", "Magic Forest",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("merry_christmas_c", new FreeGameInfo("merry_christmas_c", "Merry Christmas",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("odysseus_c", new FreeGameInfo("odysseus_c", "Odysseus",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"},
                    null,
                    null)
            );
            put("sky_way_c", new FreeGameInfo("sky_way_c", "SkyWay",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("spirit_of_aztec_e", new FreeGameInfo("spirit_of_aztec_e", "Spirit Of Aztec",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("taiga_c", new FreeGameInfo("taiga_c", "Taiga",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("thunder_reels_c", new FreeGameInfo("thunder_reels_c", "Thunder Reels",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("wild_hunter_c", new FreeGameInfo("wild_hunter_c", "Wild Hunter",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("zombirthday_c", new FreeGameInfo("zombirthday_c", "Zombirthday",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    null,
                    null)
            );

            // mobile
            put("alice_c_mob", new FreeGameInfo("alice_c_mob", "Alice in Wonderslots Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("aquatica_c_mob", new FreeGameInfo("aquatica_c_mob", "Aquatica Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("aztec_empire_c_mob", new FreeGameInfo("aztec_empire_c_mob", "Aztec Empire Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("bumper_crop_mob", new FreeGameInfo("bumper_crop_mob", "Bumper Crop Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                            "21", "22", "23", "24", "25", "26", "27"},
                    null,
                    null)
            );
            put("circus_deluxe_c_mob", new FreeGameInfo("circus_deluxe_c_mob", "Circus Deluxe Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("draculas_family_c_mob", new FreeGameInfo("draculas_family_c_mob", "Dracula's Family Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"},
                    null,
                    null)
            );
            put("eastern_delights_c_mob", new FreeGameInfo("eastern_delights_c_mob", "Eastern Delights Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("fruits_of_the_nile_c_mob", new FreeGameInfo("fruits_of_the_nile_c_mob", "Fruits of the Nile Mobile",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("fruits_n_stars_c_mob", new FreeGameInfo("fruits_n_stars_c_mob", "Fruits'n'Stars Mobile",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("happy_jungle_deluxe_c_mob", new FreeGameInfo("happy_jungle_deluxe_c_mob", "Happy Jungle Deluxe Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("juice_and_fruits_c_mob", new FreeGameInfo("juice_and_fruits_c_mob", "Juice'n'Fruits Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    null,
                    null)
            );
            put("lucky_birds_c_mob", new FreeGameInfo("lucky_birds_c_mob", "Lucky birds Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    null,
                    null)
            );
            put("lucky_pirates_c_mob", new FreeGameInfo("lucky_pirates_c_mob", "Lucky Pirates Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("lucky_reels_c_mob", new FreeGameInfo("lucky_reels_c_mob", "Lucky Reels Mobile",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("magic_forest_c_mob", new FreeGameInfo("magic_forest_c_mob", "Magic Forest Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("merry_christmas_c_mob", new FreeGameInfo("merry_christmas_c_mob", "Merry Christmas Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("notre_dames_c_mob", new FreeGameInfo("notre_dames_c_mob", "Mysteries of Notre Dames Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("odysseus_c_mob", new FreeGameInfo("odysseus_c_mob", "Odysseus Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"},
                    null,
                    null)
            );
            put("pirate_treasures_deluxe_c_mob", new FreeGameInfo("pirate_treasures_deluxe_c_mob", "Pirate's Treasures Deluxe Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("riches_of_cleopatra_c_mob", new FreeGameInfo("riches_of_cleopatra_c_mob", "Riches of Cleopatra Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("sky_way_c_mob", new FreeGameInfo("sky_way_c_mob", "SkyWay Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("spirit_of_aztec_e_mob", new FreeGameInfo("spirit_of_aztec_e_mob", "Spirit Of Aztec Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"},
                    null,
                    null)
            );
            put("taiga_c_mob", new FreeGameInfo("taiga_c_mob", "Taiga Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                    null,
                    null)
            );
            put("thunder_reels_c_mob", new FreeGameInfo("thunder_reels_c_mob", "Thunder Reels Mobile",
                    new String[]{"1", "2", "3", "4", "5"},
                    null,
                    null)
            );
            put("treasures_of_tombs_bonus_c_mob", new FreeGameInfo("treasures_of_tombs_bonus_c_mob", "Treasures Of Tombs (bonus) Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("wild_hunter_c_mob", new FreeGameInfo("wild_hunter_c_mob", "Wild Hunter Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                    null,
                    null)
            );
            put("zombirthday_c_mob", new FreeGameInfo("zombirthday_c_mob", "Zombirthday Mobile",
                    new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    null,
                    null)
            );
        }
    };

    private static final Map<String, FreeGameInfo> quickspin_freeGameInfoMap = new HashMap<String, FreeGameInfo>() {
        {
            put("spinions", new FreeGameInfo("spinions", "Spinions",
                    new String[]{}, // lines
                    new String[]{"10", "25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},           // coins
                    null)           // demomination
            );
            put("wildchase", new FreeGameInfo("wildchase", "The Wild Chase",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("geniestouch", new FreeGameInfo("geniestouch", "Genie's Touch",
                    new String[]{},
                    new String[]{"20", "40", "60", "100", "200", "400", "600", "1000", "2000", "4000", "6000", "10000"},
                    null)
            );
            put("secondstrike", new FreeGameInfo("secondstrike", "Second Strike",
                    new String[]{},
                    new String[]{"10", "20", "30", "50", "100", "250", "500", "1000", "2500", "5000", "10000"},
                    null)
            );
            put("crystalqueen", new FreeGameInfo("crystalqueen", "Crystal Queen",
                    new String[]{},
                    new String[]{"50", "100", "250", "500", "750", "1000", "1500", "2000", "2500", "5000", "7500", "10000"},
                    null)
            );
            put("bbw", new FreeGameInfo("bbw", "Big Bad Wolf",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("illuminous", new FreeGameInfo("illuminous", "Illuminous",
                    new String[]{},
                    new String[]{"40", "80", "120", "200", "400", "800", "1200", "2000", "4000", "8000"},
                    null)
            );
            put("treasureisland", new FreeGameInfo("treasureisland", "Treasure Island",
                    new String[]{},
                    new String[]{"50", "100", "250", "500", "750", "1000", "1500", "2000", "2500", "5000", "7500", "10000"},
                    null)
            );
            put("eden", new FreeGameInfo("eden", "Hidden Valley",
                    new String[]{},
                    new String[]{"120", "240", "360", "480", "600", "1200", "2400", "3600", "4800", "6000", "9000", "12000"},
                    null)
            );
            put("jewelblast", new FreeGameInfo("jewelblast", "Jewel Blast",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("titans", new FreeGameInfo("titans", "Titan Thunder",
                    new String[]{},
                    new String[]{"50", "100", "250", "500", "750", "1000", "1500", "2000", "2500", "5000", "7500", "10000"},
                    null)
            );
            put("sevens", new FreeGameInfo("sevens", "Sevens High",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("journey", new FreeGameInfo("journey", "The Epic Journey",
                    new String[]{},
                    new String[]{"80", "160", "240", "400", "800", "1200", "2000", "4000", "8000"},
                    null)
            );
            put("colossus", new FreeGameInfo("colossus", "King Colossus",
                    new String[]{},
                    new String[]{"40", "80", "120", "200", "400", "800", "1200", "2000", "4000", "8000", "12000"},
                    null)
            );
            put("musketeers", new FreeGameInfo("musketeers", "The Three Musketeers",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("royalfrog", new FreeGameInfo("royalfrog", "Royal Frog",
                    new String[]{},
                    new String[]{"160", "320", "480", "800", "1600", "3200", "4800", "8000", "16000"},
                    null)
            );
            put("sugartrail", new FreeGameInfo("sugartrail", "Sugar Train",
                    new String[]{},
                    new String[]{"40", "80", "120", "200", "400", "800", "1200", "2000", "4000", "8000"},
                    null)
            );
            put("sinbad", new FreeGameInfo("sinbad", "Sinbad",
                    new String[]{},
                    new String[]{"40", "80", "120", "200", "400", "800", "1200", "2000", "4000", "8000"},
                    null)
            );
            put("firestorm", new FreeGameInfo("firestorm", "Firestorm",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("sabretooth", new FreeGameInfo("sabretooth", "Razortooth",
                    new String[]{},
                    new String[]{"25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
            put("goldlab", new FreeGameInfo("goldlab", "Gold Lab",
                    new String[]{},
                    new String[]{"10", "25", "50", "75", "100", "125", "250", "500", "750", "1000", "1250", "2500", "5000", "10000"},
                    null)
            );
        }
    };

    public FreeGameOptionsUtil() {}

    public static Map<String, String> getFreeGameGameList(String platformCode) {
        Map<String, FreeGameInfo> freeGameList = findPlatformFreeGameList(platformCode);
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, FreeGameInfo> entry : freeGameList.entrySet()) {
            String gameId = entry.getKey();
            FreeGameInfo freeGameInfo = entry.getValue();
            options.put(gameId, freeGameInfo.getGameName());
        }

        return options;
    }

    public static Map<String, String> getFreeGameCoinsList(String platformCode) {
        Map<String, FreeGameInfo> freeGameList = findPlatformFreeGameList(platformCode);
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, FreeGameInfo> entry : freeGameList.entrySet()) {
            String gameId = entry.getKey();
            FreeGameInfo freeGameInfo = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : freeGameInfo.getCoins()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

    public static Map<String, String> getPlayNGoFreeGameLinesList(String platformCode) {
        Map<String, FreeGameInfo> freeGameList = findPlatformFreeGameList(platformCode);
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, FreeGameInfo> entry : freeGameList.entrySet()) {
            String gameId = entry.getKey();
            FreeGameInfo freeGameInfo = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : freeGameInfo.getLines()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

    public static Map<String, String> getPlayNGoFreeGameDenominationsList(String platformCode) {
        Map<String, FreeGameInfo> freeGameList = findPlatformFreeGameList(platformCode);
        Map<String, String> options = new LinkedHashMap<String, String>();

        for(Map.Entry<String, FreeGameInfo> entry : freeGameList.entrySet()) {
            String gameId = entry.getKey();
            FreeGameInfo freeGameInfo = entry.getValue();
            String basedItemKey = gameId + "_";

            int itemIndex = 0;
            for(String item : freeGameInfo.getDenominations()) {
                String itemKey = basedItemKey + itemIndex;
                options.put(itemKey, item);
                itemIndex++;
            }
        }

        return options;
    }

    private static Map<String, FreeGameInfo> findPlatformFreeGameList(String platformCode) {
        if(platformCode.equals(OmegaConstants.PLATFORM_PLAYNGO)) {
            return playson_freeGameInfoMap;
        } else if(platformCode.equals(OmegaConstants.PLATFORM_QUICKSPIN)) {
            return quickspin_freeGameInfoMap;
        } else {
            return null;
        } //todo refacter, add other free game paltform later, like Play'n Go
    }

}
