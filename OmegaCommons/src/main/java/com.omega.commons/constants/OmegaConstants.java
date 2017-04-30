package com.omega.commons.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class OmegaConstants {


    public static final int DEFAULT_MINIMUM_AGE = 18;
    public static final String MINIMUM_SIGNUP_AGE = "minimumSignupAge";

    public static final String MIN_USERID_LENGTH_KEY = "minimumUserIdLength";
    public static final String MAX_USERID_LENGTH_KEY = "maximumUserIdLength";

    public static final String USER_ID_VALIDATION_REQUIRED = "userId.validation.required";
    public static final boolean USER_ID_VALIDATION_REQUIRED_DEFAULT = true;

    public static final int MIN_USERID_LENGTH = 8;
    public static final int MAX_USERID_LENGTH = 50;

    public static final String MIN_NICKNAME_LENGTH_KEY = "minimumNicknameLength";
    public static final String MAX_NICKNAME_LENGTH_KEY = "maximumNicknameLength";

    public static final int DEFAULT_MIN_NICKNAME_LENGTH = 2;
    public static final int DEFAULT_MAX_NICKNAME_LENGTH = 16;

    public static final int MIN_PASSWORD_LENGTH = 6;
    public static final int MAX_PASSWORD_LENGTH = 16;

    public static final int MAX_PLAYER_AGE = 150;

    public static final int MAX_EMAIL_LENGTH = 40;
    public static final int MAX_SECURITY_QUESTION_LENGTH = 100;
    public static final int MAX_SECURITY_ANSWER_LENGTH = 255;
    public static final int MAX_FIRST_NAME_LENGTH = 50;
    public static final int MAX_LAST_NAME_LENGTH = 50;
    public static final int MAX_GENDER_LENGTH = 1;
    public static final int MAX_ADDRESS_LENGTH = 75;
    public static final int MAX_COUNTRY_LENGTH = 75;
    public static final int MAX_POSTAL_CODE_LENGTH = 10;
    public static final int MAX_MOBILE_LENGTH = 15;
    public static final int MAX_PHONE_LENGTH = 15;
    public static final int MAX_CITY_LENGTH = 30;
    public static final int MAX_PROVINCE_LENGTH = 30;
    public static final int MAX_UNIT_LENGTH = 20;

    public static final char CSV_SEPARATOR = ',';

    public static final int MAX_LOGIN_ATTEMPTS = 6;
    public static final String MAX_LOGIN_ATTEMPTS_KEY = "MAX_LOGIN_ATTEMPTS";

    public static final int MAX_IDLE_TIME = 30; //in minutes
    public static final String MAX_IDLE_TIME_KEY = "MAX_IDLE_TIME";

    public static final int LAND_BASED_CASHIER_MAX_IDLE_TIME = 30; //in minutes
    public static final String LAND_BASED_CASHIER_MAX_IDLE_TIME_KEY = "LAND_BASED_CASHIER_MAX_IDLE_TIME";

    public static final int DEFAULT_TIME_OUT = 5000; //in milli seconds

    public static final int PASSWORD_EXPIRY_DAYS = 90; //in minutes
    public static final String PASSWORD_EXPIRY_KEY = "PASSWORD_EXPIRY_DAY";
    public static final String STAFF_OWN_PASSWORD_EDIT_URL = "/j/staff/StaffOwnPasswordEdit.action";

    public static final String CMS_DASHBOARD_USE_SAMPLE_DATA_KEY = "cmsDashboard.useSampleData";
    public static final boolean CMS_DASHBOARD_USE_SAMPLE_DATA = false;

    public static final String ENABLE_EMAIL_OPT_IN_KEY = "enableEmailOptIn";
    public static final Boolean ENABLE_EMAIL_OPT_IN = Boolean.FALSE;

    public static final String EMAIL_DEFAULT_FROM_KEY = "mail.defaultFrom";
    public static final String EMAIL_DEFAULT_FROM = "omgtestsupport@mailinator.com";

    public static final String ALERT_LOG_EMAIL_TIME_TO_SENT_KEY = "alertLogEmail.timeToSend";
    public static final int ALERT_LOG_EMAIL_TIME_TO_SENT = 8;

    public static final String ALERT_LOG_EMAIL_NUMBER_OF_EXCEL_ITEMS_KEY = "alertLogEmail.numberOfExcelItems";
    public static final Integer ALERT_LOG_EMAIL_NUMBER_OF_EXCEL_ITEMS = 1000;

    public static final String SYSTEM_NAME_KEY = "system.name";
    public static final String SYSTEM_NAME = "Omega System";

    public static final String DEFAULT_PS_CONTEXT = "/ps";
    public static final String EMAIL_LINK_URL = DEFAULT_PS_CONTEXT + "/pub/EmailLink.action";
    public static final String EMAIL_LINK_TYPE_CONFIRM = "confirm";
    public static final String EMAIL_LINK_TYPE_RESET = "reset";
    public static final String EMAIL_LINK_TYPE_REFER = "refer";
    public static final String EMAIL_EXCLUDE_LOCK_LINK_URL = DEFAULT_PS_CONTEXT + "/pub/UnlockSelfExclusion.action";

    public static final String WITHDRAWAL_LOCKED_URL = DEFAULT_PS_CONTEXT + "/pub/WithdrawalLogin.action";


    public static final String PARLAY_SITEAPI_URL_KEY = "parlay.SiteApiUrl";
    public static final String PARLAY_SITEAPI_URL = "https://palapp.parlaygames.net";
    public static final String PARLAY_SITEAPI_SITEID_KEY = "parlay.siteId";
    public static final String PARLAY_SITEAPI_SITEID = "PAL";
    public static final String PARLAY_SITEAPI_KEY_KEY = "parlay.key";
    public static final String PARLAY_SITEAPI_KEY = "3kxksi389es";
    public static final String PARLAY_SITEAPI_ADMINUSERNAME_KEY = "parlay.adminUsername";
    public static final String PARLAY_SITEAPI_ADMINUSERNAME = "NETWORK_admin";
    public static final String PARLAY_SITEAPI_ADMINPASSWORD_KEY = "parlay.adminPassword";
    public static final String PARLAY_SITEAPI_ADMINPASSWORD = "";

    public static final String MGBINGO_CAPI_URL_KEY = "mgBingo.capiUrl";
    public static final String MGBINGO_CAPI_URL = "http://localhost:8080/omegatest/MGBingo.action";

    public static final String MGBINGO_CARAPI_URL_KEY = "mgBingo.carapiUrl";
    public static final String MGBINGO_CARAPI_URL = "http://localhost:8080/omegatest/MGBingo.action";

    public static final String MGPOKER_CAPI_URL_KEY = "mgPoker.capiUrl";
    public static final String MGPOKER_CAPI_URL_DEFAULT = "http://localhost:8080/omegatest/Microgaming.action";
    public static final String MGPOKER_CAPI_LOGIN = "mgPoker.capiLogin";
    public static final String MGPOKER_CAPI_PASSWORD = "mgPoker.capiPassword";
    public static final String MGPOKER_CAPI_SERVERID = "mgPoker.capiServerId";


    public static final String TERMS_AND_CONDITIONS_KEY = "terms-and-conditions";
    public static final String TERMS_AND_CONDITIONS_URL = "/terms-and-conditions";

    public static final String TERMS_AND_CONDITIONS_MESSAGE_KEY = "terms-and-conditions-message";

    // this is the minimum amount for big wins in the db, any wins
    // smaller than this are not considered big wins.
    public static final int MINIMUM_BIG_WIN_AMOUNT = 50;

    public static final int MINIMUM_WITHDRAWAL_AMOUNT = 50;

    public static final String SIGNUP_DEPOSIT_EMAILER_ENABLED = "signupDepositEmailer.Enabled";
    public static final String SIGNUP_DEPOSIT_EMAILER_INTERVAL = "signupDepositEmailer.interval";
    public static final String SIGNUP_DEPOSIT_EMAILER_REGISTERWINDOW = "signupDepositEmailer.registerWindow";
    public static final int SIGNUP_DEPOSIT_EMAILER_REGISTERWINDOW_DEFAULT = 48;

    public static final String QUICK_SIGNUP_EMAILER_ENABLED = "quickSignupEmailer.Enabled";
    public static final String QUICK_SIGNUP_EMAILER_WAIT_MINUTE = "quickSignupEmailer.waitMinute";
    public static final int QUICK_SIGNUP_EMAILER_WAIT_MINUTE_DEFAULT = 60;

    public static final String AUTO_GENERATED_USERID_ENABLED = "autoGeneratedUserId.Enabled";
    public static final Boolean AUTO_GENERATED_USERID_ENABLED_DEFAULT = Boolean.FALSE;

    public static final String POSTAL_CODE_LOOKUP_ENABLED = "postalCode.lookUp.Enabled";
    public static final Boolean POSTAL_CODE_LOOKUP_ENABLED_DEFAULT = Boolean.FALSE;

    public static final String POSTAL_CODE_LOOKUP_KEY = "postalCode.lookUp.key";
    public static final String POSTAL_CODE_LOOKUP_KEY_DEFAULT = "";
    /**
     * To be removed with user
     */
    public static final int RAW_TO_LOYALTY_CONVERSION = 30000;

    public static final String CHART_BACKGROUND_COLOR = "F0F0F0";

    public static final String GAME_DETAIL_URL = "/j/player/ViewSportsBetTransaction.action";
    public static final String COMTRADE_GAME_DETAIL_URL = "/j/ComTradeGameDetails.action";
    public static final String COMPTRADE_RGS_AGENT_KEY = "comtrade.rgs";
    public static final String COMPTRADE_RGS_AGENT_DEFAULT = "http://livegames.hsl.eu/test/rgsagent/RGSAgent.svc";

    public static final String PARLAY_GAME_DETAIL_URL = "/j/ParlayGameDetails.action";
    public static final String IGT_GAME_DETAIL_URL = "/j/IgtGameDetails.action";
    public static final String QUICKSPIN_GAME_DETAIL_URL = "/j/QuickSpinGameDetails.action";

    public static final String NYX_CAS_GAME_DETAIL_URL = "/j/NYXGameDetails.action";

    public static final String PLAYSON_GAME_DETAIL_URL = "/j/PlaysonGameDetails.action";


    public static final String ILLEGAL_ACCESS_URL = "/j/IllegalResourceAccess.action";

    public static final String OMEGA_CORE = "/j/OmegaCORE.html";

    public static final String OMEGA_GWT_RESOURCE = "/j/com.omega.cms.web.gwt.OmegaCmsGWT";

    public static final String SESSION_COOKIE_KEY = "SESSION_KEY";

    public static final String INITIAL_REGISTRATION_STATUS_KEY = "signup.initialRegistrationStatus";
    public static final String INITIAL_QUICK_REGISTRATION_STATUS_KEY = "quickSignup.initialRegistrationStatus";
    public static final String QUICK_REGISTRATION_SEND_CONFIRMATION_EMAIL_KEY = "quickSignup.sendConfirmationEmail";

    public static final String INFO_ICON_URL = "/j/static/images/info.png";
    public static final String PLAYER_PREVIEW_URL = "/j/preview/PlayerPreview.action";
    public static final String PLATFORM_CONVERSION_PREVIEW_URL = "/j/preview/PlatformConversionPreview.action";
    public static final String ALERT_LOG_PREVIEW_URL = "/j/preview/AlertLogPreview.action";
    public static final String SPORTS_TICKET_DETAIL_URL = "/j/player/ViewSportsTicket.action";
    public static final String GAME_INSTANCE_DETAIL_URL = "/j/player/ViewGameInstance.action";
    public static final String LOGOUT_URL = "/j/Logout.action";

    public static final String MORE_INFO_CLASS = "moreInfo";
    public static final String WARNING_CLASS = "warning";
    public static final String NYRO_MODAL_CLASS = "nyroModal";
    public static final String NYRO_MODAL_LARGE_CLASS = "nyroModalLarge";

    public static final String PLAYER_PAGE_URL = "/j/player/PlayerDashboard.action";

    public static final String DOMAIN_DEFAULT = "http://berndemo.omegagaming.com/ps/";

    //public static final String CHARTWELL_ID_PREFIX = "CAI_";

    public static final String TRACKING_CODE_BTAG = "btag";    // NetRefer btag
    public static final String TRACKING_CODE_TTID = "TTID";    // TradeTracker Id
    public static final String TRACKING_CODE_PNID = "PNID";    // pokah nights
    public static final String TRACKING_CODE_TDUID = "tduid";   // tradedoubler - individual referred player
    public static final String TRACKING_CODE_AFFID = "affId";   // tradedoubler - individual affiliate
    public static final String TRACKING_CODE_PPCID = "ppcid";
    public static final String TRACKING_CODE_OPID = "opid";
    public static final String TRACKING_CODE_GOFILIATEID = "gfid";
    public static final String[] TRACKING_CODES = {"epi", "epi2", TRACKING_CODE_TDUID, TRACKING_CODE_AFFID,
            "mbRid", "mbExtRefId", TRACKING_CODE_PNID, "PBID", "PRID", "PCID", TRACKING_CODE_TTID, TRACKING_CODE_BTAG,
            TRACKING_CODE_PPCID, TRACKING_CODE_OPID, TRACKING_CODE_GOFILIATEID};

    public static final String FORCED_TRACKING_CODE_PREFIX = "forcedTrackingCode.";

    public static final HashSet<String> TRACKING_CODE_SET = new HashSet<String>(Arrays.asList(TRACKING_CODES));
    public static final String DATE_TIME_FORMAT2 = "dd-MM-yyyy HH:mm:ss z";
    public static final String NATIONAL_REG_NUMBER_MAX_LENGTH_KEY = "signup.nationalRegNumberMaxLength";
    public static final int NATIONAL_REG_NUMBER_MAX_LENGTH = 20;
    // Platform codes
    public static final String PLATFORM_CW_CAS = "CW_CAS"; // Chartwell casino
    public static final String PLATFORM_OFFSIDE = "OFFSIDE"; // Offside Sportsbook
    public static final String PLATFORM_NETENT_CAS = "NETENT_CAS"; // NetEnt casino
    public static final String PLATFORM_OMEGA_CAS = "OMEGA_CAS"; // Omega casino
    public static final String PLATFORM_MG_POKER = "MG_POKER"; // Microgaming Poker
    public static final String PLATFORM_MG_BINGO = "MG_BINGO"; // Microgaming Bingo
    public static final String PLATFORM_MGS_LIVE = "MGS_LIVE"; // Microgaming Live Dealer
    public static final String PLATFORM_QFIRE_CAS = "QFIRE_CAS"; // QFIRE Casine
    public static final String PLATFORM_BGS_SPORTS = "BGS_SPORTS"; // BGS Sports
    public static final String PLATFORM_ANGLE_CAS = "ANGLE_CAS"; // Angle Casino
    public static final String PLATFORM_PARLAY_BINGO = "PALY_BINGO"; // Parlay Bingo
    public static final String PLATFORM_PARLAY_CASINO = "PALY_CAS"; // Parlay Casino
    public static final String PLATFORM_IGT_CAS = "IGT_CAS"; // IGT Casino
    public static final String PLATFORM_EZUGI = "EZUGI"; // EZUGI Casino
    public static final String PLATFORM_COMTRADE = "CT_CAS"; // ComTrade Casino
    public static final String PLATFORM_NYX_CAS = "NYX_CAS"; // NYX Casino
    public static final String PLATFORM_EVO_CAS = "EVO_CAS"; // EVO Casino
    public static final String PLATFORM_YGGDRASIL = "YGGDRASIL"; // Yggdrasil casino
    public static final String PLATFORM_AIRDICE = "AIRDICE"; // AirDice Casino
    public static final String PLATFORM_AIRDICE_BINGO = "AD_BINGO"; // AirDice Casino
    public static final String PLATFORM_BETGAMES = "BETGAMES"; // BetGames.tv
    public static final String PLATFORM_TOPGAME = "TOPGAME"; // BetGames.tv
    public static final String PLATFORM_BETCONSTRUCT = "BETCONST";
    public static final String PLATFORM_GENII = "GENII";
    public static final String PLATFORM_ISOFTBET = "ISOFTBET";
    public static final String PLATFORM_PLAYNGO = "PLAYNGO";
    public static final String PLATFORM_PLAYSON = "PLAYSON";
    public static final String PLATFORM_MTL_CAS = "MTL_CAS";
    public static final String PLATFORM_QUICKSPIN = "QUICKSPIN";
    public static final String PLATFORM_DIGITAIN_SPORTBOOK = "DIGITAIN_SPORTBOOK";
    public static final String PLATFORM_RHINO = "SLOTCO";
    public static final String PLATFORM_FAZI = "FAZI";
    public static final String PLATFORM_BETSOFT = "BETSOFT";

    public static final String IGT_SOAP_URL = "IGT_SOAP_URL";
    public static final String IGT_SOAP_URL_DEFAULT = "https://rgs-cust03.lab.wagerworks.com/ws-v2/";
//    public static final String IGT_SOAP_URL_DEFAULT = "https://rgs-cust03.lab.wagerworks.com/ws-v2/gameTransactionDetail";
    public static final String IGT_SOAP_USERNAME = "IGT_SOAP_USERNAME";
    public static final String IGT_SOAP_USERNAME_DEFAULT = "ws-TPAL";
    public static final String IGT_SOAP_PASSWORD = "IGT_SOAP_PASSWORD";
    public static final String IGT_SOAP_PASSWORD_DEFAULT = "password";
    public static final String IGT_SKINCODE = "IGT_SKINCODE";
    public static final String IGT_SKINCODE_DEFAULT = "TP01";
    public static final String MICROGAMING_JACKPOT_URL = "microgaming.jackpot.url";
    public static final String MICROGAMING_JACKPOT_URL_DEFAULT = "http://www.tickerassist.co.uk/ProgressiveTickers/WebServiceProgressiveTickerXMLAll.asmx/tickerXMLFeedAll";
    public static final String ANGLEGAMES_GAME_DETAILS_URL = "angle.gameDetailLink";
    public static final String ANGLEGAMES_GAME_DETAILS_KEY = "angle.gameDetailLink.key";
    public static final String ANGLEGAMES_GAME_DETAILS_URL_DEFAULT = "http://ws.chipscasino.co.uk/gs/admin/gr";
    public static final String ANGLEGAMES_GAME_DETAILS_KEY_DEFAULT = "OMEGA_123";
    // this constant represents the date for which we will go back to for running reports,
    // showing options in drop downs, ..... For now it's hard coded, but should probably
    // be put in a configurable place. It can be considered the point at which the business
    // opened it's doors
    //public static final LocalDate BEGINNING_OF_TIME = new LocalDate(1997, 1, 1);
    public static final String PARLAY_SYSTEM_TIMEZONE_KEY = "parlay.bingoTimezone";
    public static final String PARLAY_SYSTEM_TIMEZONE_ID = "Europe/London";
    public static final String TARGET_SYSTEM_TIMEZONE_KEY = "target.bingoTimezone";
    public static final String TARGET_SYSTEM_TIMEZONE_ID = "Europe/London";
    // MoneyBookers
    public static final String MB_STATUS_PENDING = "0";
    public static final String MB_STATUS_SUCCESS = "2";
    public static final String MB_STATUS_CANCELLED = "-1";
    public static final String MB_STATUS_FAILED = "-2";
    // Hipay
    public static final String HIPAY_STATUS_OK = "ok";
    public static final String HIPAY_STATUS_NOK = "nok";
    public static final String HIPAY_STATUS_CANCEL = "cancel";
    public static final String HIPAY_OPERATION_CAPTURE = "capture";
    public static final String HIPAY_OPERATION_AUTHORIZATION = "authorization";
    public static final String HIPAY_OPERATION_CANCELLATION = "cancellation";
    public static final String HIPAY_OPERATION_REFUND = "refund";
    public static final String HIPAY_OPERATION_REJECT = "reject";
    // ENVOY
    public static final String ENVOY_STATUS_OK = "0";
    // CredoRax
    public static final String CREDORAX_STATUS_SUCCESS = "0";
    //  Promote (EasyPay, PayDirect)
    public static final String PROMOTE_STATUS_APPROVED = "1";
    public static final String PROMOTE_STATUS_PENDING = "2";
    // oGone


    public static final String SPORTSBOOK_USERNAME = "sportsbook.username";// Offside Sportsbook Username
    public static final String SPORTSBOOK_PASSWORD = "sportsbook.password"; // Offside Sportsbook Password
    public static final String DEFAULT_SPORTSBOOK_USERNAME = "q";// Offside Sportsbook Username
    public static final String DEFAULT_SPORTSBOOK_PASSWORD = "w"; // Offside Sportsbook Password



    public static final Integer OGONE_STATUS_AUTHORIZED = 5;
    public static final Integer OGONE_STATUS_REQUESTED = 9;
    public static final Integer OGONE_STATUS_WAITING = 51;
    public static final Integer OGONE_STATUS_PROCESSING = 91;
    public static final Integer OGONE_STATUS_CANCELLED = 1;
    public static final int PS_MAX_LOGIN_ATTEMPTS_DEFAULT = 6;
    public final static String GAME_PREFERENCE_POKER = "POKER";
    public final static String GAME_PREFERENCE_CASINO = "CASINO";
    public final static String GAME_PREFERENCE_BINGO = "BINGO";
    public final static String GAME_PREFERENCE_NA = "N/A";
    public final static String GAME_PREFERENCE_DEFAULT = "BINGO";
    // bonusPlan related
    public static final String COUPON_BASED_CHARACTER = "abcdefghigklmnopqrstuvwxyz";
    // development mode flag
    public static final String IN_DEVELOPMENT_MODE = "inDevMode";
    public static final Boolean IN_DEVELOPMENT_MODE_DEFAULT = Boolean.FALSE;
    // system admin stuff
    public static final Integer SYSTEM_STAFF_ID = 1;
    public static final String GOLDENSCOOPHOUR_KEY = "parlay.bingo.goldenScoopHour";
    public static final String SILVERSCOOPHOUR_KEY = "parlay.bingo.silverScoopHour";
    public static final String BRONZESCOOPHOUR_KEY = "parlay.bingo.bronzeScoopHour";
    // variables for email templates
    public static final String EMAIL_CONFIRMATION_SUBJECT = "Confirmation email for ${user.userId}";
    public static final String EMAIL_CONFIRMATION_BODY = "You can confirm your email with this link ${confirmationLink}";
    public static final String EMAIL_WELCOME_REGISTRATION_SUBJECT = "Welcome to our site ${user.firstName}";
    public static final String EMAIL_WELCOME_REGISTRATION_BODY = "Congratulations ${user.firstName}, your account has been officially confirmed.";
    public static final String EMAIL_RESET_PASSWORD_SUBJECT = "Reset Password for ${user.userId}";
    public static final String EMAIL_RESET_PASSWORD_BODY = "You can reset your password with this link ${resetPasswordLink}";
    public static final String EMAIL_QUICK_SIGNUP_REMIND_SUBJECT = "Complete Registration Reminder";
    public static final String EMAIL_QUICK_SIGNUP_REMIND_BODY = "Confirmation email body for ${user.userId} link is ${confirmationLink}";
    public static final String EMAIL_DEPOSIT_FAILED_SUBJECT = "Failed Deposit Notification";
    public static final String EMAIL_DEPOSIT_FAILED_BODY = "Dear ${user.fullName},\n" +
            "\n" +
            "Your ${payment.paymentMethod.name} Deposit in the amount of ${payment.amount} has been FAILED.\n" +
            "Message: ${payment.misc}\n" +
            "Timestamp: ${payment.requestDate}\n" +
            "\n" +
            "Thank you,\n" +
            "\n" +
            "${user.brand.brandName}";
    public static final String EMAIL_DEPOSIT_FAILED_TO_ADMIN_SUBJECT = "Failed Deposit Notification";
    public static final String EMAIL_DEPOSIT_CONFIRM_SUBJECT = "Deposit Confirmation Email for ${user.userId}";
    public static final String EMAIL_DEPOSIT_CONFIRM_BODY = "Dear ${user.fullName},\n" +
            "\n" +
            "Your ${payment.paymentMethod.name} deposit in the amount of ${payment.amount} has been processed.\n" +
            "\n" +
            "Thank you,\n" +
            "\n" +
            "${user.brand.brandName}";
    public static final String EMAIL_WITHDRAWAL_CONFIRM_SUBJECT = "Withdrawal Confirmation Email for ${user.userId}";
    public static final String EMAIL_WITHDRAWAL_CONFIRM_BODY = "Dear ${user.fullName},\n" +
            "\n" +
            "Your ${payment.paymentMethod.name} withdrawal in the amount of ${payment.amount} has been processed.\n" +
            "\n" +
            "Thank you,\n" +
            "\n" +
            "${user.brand.brandName}";
    public static final String EMAIL_WITHDRAWAL_REQUEST_SUBJECT = "Withdrawal Request Email for ${user.userId}";
    public static final String EMAIL_WITHDRAWAL_REQUEST_BODY = "Dear ${user.fullName},\n" +
            "\n" +
            "Your ${payment.paymentMethod.name} withdrawal request in the amount of ${payment.amount} has been received.\n" +
            "\n" +
            "Thank you,\n" +
            "\n" +
            "${user.brand.brandName}";
    public static final String EMAIL_DEPOSIT_REMINDER_SUBJECT = "Deposit Reminder";
    public static final String EMAIL_DEPOSIT_REMINDER_BODY = "Hello ${user.firstName}, Please be reminded to deposit some money into your account.";
    public static final String EMAIL_REFERRAL_SUBJECT = "Welcome ${userReferral.email}";
    public static final String EMAIL_REFERRAL_BODY = "Welcome to OMEGA. Your friend refer to you to us. To have fun, please click on the link below to signup your account.  ${referralLink}";
    public static final String EMAIL_TEST_SUBJECT = "Test";
    public static final String EMAIL_TEST_BODY = "Test";
    public static final String EMAIL_BANKWIRE_TO_ADMIN_SUBJECT = "Bank Wire";
    public static final String EMAIL_BANKWIRE_TO_ADMIN_BODY = "Time Stamp: (separate from email client time stamp we will see, this is the time stamp when form is submitted ? incase email problems)\n" +
            "\n" +
            "Name: ${user.fullName}\n" +
            "\n" +
            "\n" +
            "Transaction Method: Bank Transfer\n" +
            "\n" +
            "Account Number: ${accountNumber}\n" +
            "\n" +
            "Party ID: ${user.accountId}\n" +
            "\n" +
            "Brand Name: GaneGrande\n" +
            "\n" +
            "Amount: ${amount}\n" +
            "\n" +
            "Transaction ID: ${description}";
    public static final String EMAIL_BANKWIRE_CONFIRM_SUBJECT = "Bank Wire Confirmation";
    public static final String EMAIL_BANKWIRE_CONFIRM_BODY = "${bankName} ${accountNumber} ${amount}";
    public static final String EMAIL_KYC_DOCUMENT_REQUEST_SUBJECT = "ID Documentation Request";
    public static final String EMAIL_KYC_DOCUMENT_REQUEST_BODY =
            "Dear  ${user.fullName} \n" +
                    "\n" +
                    "We hope that you are enjoying spending time on our website with all the latest games that we have to offer.\n" +
                    "When you made your first deposit we ran an automatic check to verify your age.  This is standard practice and a requirement of the terms of our UK Gambling Commission licence.  Unfortunately, the automated system was unable to verify your identity automatically so we are sending you this message to request that you send us copies of some form of Identification Documents.  \n" +
                    "We are required by the rules to receive these documents no later than 72 hours following your first account deposit and before any withdrawal requests are processed.  If we do not receive them by that time then we are required to temporarily suspend the account until the documents have been received and verified.\n" +
                    "I would be grateful if you could reply to this email with a copy of two forms of ID, 1 from LIST A, and 1 from LIST B.  Please leave the subject line of this email unchanged as this will assist us in tracking your submission.  Scanned copies or high quality image taken with a mobile phone are acceptable.\n" +
                    "If there is anything we can do to assist, please do not hesitate to get in touch.\n" +
                    "Kind Regards\n" +
                    "${user.brand.url} Team\n" +
                    "LIST A (1 Document from this list) \n" +
                    "Passport\n" +
                    "\n" +
                    "Birth Certificate\n" +
                    "EEA Member State Identity Card\n" +
                    "Current UK or EEA Photocard Driving Licence\n" +
                    "Resident Permit issued by the Home Office to EEA Nationals\n" +
                    "National Identity Card (including Photograph) \n\n" +
                    "LIST B (1 Document from this list, cannot be the same document used for List A)\n" +
                    "Utility Bill issued within the last 3 months.\n" +
                    "Council Tax Bill for current year.\n" +
                    "UK Driving Licence.\n" +
                    "Bank, Building Society or Credit Union Statement (dated in last 3 months).\n" +
                    "Mortgage Statement for the last full year.\n" +
                    "Solicitors Letter (dated in last 3 months) confirming house purchase or land registry confirmation of address.\n" +
                    "HMRC Self Assessment letter or tax demand within current financial year.\n" +
                    "NHS Medical Card";

    public static final String EMAIL_KYC_DOCUMENT_REMINDER_SUBJECT = EMAIL_KYC_DOCUMENT_REQUEST_SUBJECT + " Reminder";
    public static final String EMAIL_KYC_DOCUMENT_REMINDER_BODY = EMAIL_KYC_DOCUMENT_REQUEST_BODY;
    public static final String KYC_DOCUMENT_REQUEST_FAILED_LOCK_SUBJECT = EMAIL_KYC_DOCUMENT_REQUEST_SUBJECT + " Account Temporarily Suspended";
    public static final String KYC_DOCUMENT_REQUEST_FAILED_LOCK_SUBJECT_BODY =
            "Dear  ${user.fullName} \n" +
                    "\n" +
                    "We hope that you are enjoying spending time on our website with all the latest games that we have to offer.\n" +
                    "When you made your first deposit we ran an automatic check to verify your age.  This is standard practice and a requirement of the terms of our UK Gambling Commission licence.  Unfortunately, the automated system was unable to verify your identity automatically so we are sending you this message to request that you send us copies of some form of Identification Documents.  \n" +
                    "We are required by the rules to receive these documents no later than 72 hours following your first account deposit and before any withdrawal requests are processed.  Unfortunately we have not received your respond yet. The account has been temporarily suspended until the documents have been received and verified.\n" +
                    "I would be grateful if you could reply to this email with a copy of two forms of ID, 1 from LIST A, and 1 from LIST B.  Please leave the subject line of this email unchanged as this will assist us in tracking your submission.  Scanned copies or high quality image taken with a mobile phone are acceptable.\n" +
                    "If there is anything we can do to assist, please do not hesitate to get in touch.\n" +
                    "Kind Regards\n" +
                    "${user.brand.url} Team\n" +
                    "LIST A (1 Document from this list) \n" +
                    "Passport\n" +
                    "\n" +
                    "Birth Certificate\n" +
                    "EEA Member State Identity Card\n" +
                    "Current UK or EEA Photocard Driving Licence\n" +
                    "Resident Permit issued by the Home Office to EEA Nationals\n" +
                    "National Identity Card (including Photograph) \n\n" +
                    "LIST B (1 Document from this list, cannot be the same document used for List A)\n" +
                    "Utility Bill issued within the last 3 months.\n" +
                    "Council Tax Bill for current year.\n" +
                    "UK Driving Licence.\n" +
                    "Bank, Building Society or Credit Union Statement (dated in last 3 months).\n" +
                    "Mortgage Statement for the last full year.\n" +
                    "Solicitors Letter (dated in last 3 months) confirming house purchase or land registry confirmation of address.\n" +
                    "HMRC Self Assessment letter or tax demand within current financial year.\n" +
                    "NHS Medical Card";
    public static final String DATE_MODE_REVENUE = "REVENUE";
    public static final String DATE_MODE_REGISTRATION = "REGISTRATION";
    /**
     * self exclusion
     */
    public static final String SELF_EXCLUSION_LOCK_UNTIL_PARAM_KEY = "selfExclusion.lockUntilParam";
    public static final String SELF_EXCLUSION_LOCK_EMAIL_NOTIFICATION_KEY = "selfExclusion.emailNotification";
    public static final String SELF_EXCLUSION_LOCK_EMAIL_NOTIFICATION_SUBJECT_KEY = "selfExclusion.emailNotification.subject";
    public static final String SELF_EXCLUSION_LOCK_EMAIL_NOTIFICATION_SUBJECT_DEFAULT = "Self Exclusion Notification";
    public static final String SELF_EXCLUSION_AUTO_UNLOCK_KEY = "selfExclusion.autoUnlock";
    public static final Boolean SELF_EXCLUSION_AUTO_UNLOCK_DEFAULT = true;
    public static final String SELF_EXCLUSION_LOCK_EMAIL_BODY = "User: ${user.userId} permanently lock: ${permanentlyLock}, lock until: ${lockuntil}";
    public static final String TIMEOUT_LOCK_UNTIL_PARAM_KEY = "timeout.lockUntilParam";
    public static final String KYC_EXPERIAN = "kyc.experian";
    public static final String KYC_RBS = "kyc.rbs";
    public static final String KYC_REGISTRATION_PROHIBITIVE = "kyc.registration.prohibitive";
    public static final boolean KYC_REGISTRATION_PROHIBITIVE_DEFAULT = false;
    public static final String KYC_REGISTRATION_ENABLE = "kyc.registration.enable";
    public static final boolean KYC_REGISTRATION_ENABLE_DEFAULT = false;
    public static final boolean KYC_EXPERIAN_DEFAULT = true;
    public static final boolean KYC_RBS_DEFAULT = false;
    public static final String CURRENCY_CONVERSION_SHOW_ON_REPORTS = "currencyConversion.showOnReports";
    public static final boolean CURRENCY_CONVERSION_SHOW_ON_REPORTS_DEFAULT = false;
    public static final String CACHING_CONFIG_SERVICE = "caching.configService";
    public static final String CACHING_EXPIRE = "caching.expire";
    public static final Integer CACHING_EXPIRE_DEFAULT = 30;
    public static final String PLAYER_LOCK_REASON_ENABLED_KEY = "playerLockReason.enabled";
    public static final Boolean PLAYER_LOCK_REASON_DEFAULT = false;
    public static final String PLAYER_LOCK_REASON_CONFIG_URL = "/j/admin/PlayerLockReasonConfig.action";
    public static final String PLAYER_LOCK_REASON_REPORT_URL = "/j/reports/PlayerLockReasonReport.action";
    public static final String CMS_PLAYER_PS_URL_KEY = "cmsPlayerPS.url";
    public static final String CMS_PLAYER_SIGNUP_TERMS_AND_CONDITIONS_KEY = "cmsPlayerSignup.termAndConditions";
    // report show detail
    public final static String REPORT_SHOW_DETAIL_ENABLE = "report.showDetail.enable";
    public static final boolean REPORT_SHOW_DETAIL_ENABLE_DEFAULT = false;
    public static final String  WORLDPAY_AP_API_VERSION = "WorldPayAP.api.version";
    public static final Integer DEFAULT_WORLDPAY_AP_API_VERSION = 3;
    // player deposit limit
    public static final String PLAYER_DEPOSIT_LIMIT_COOL_DOWN_PERIOD_ENABLED = "playerDepositLimit.coolDownPeriod.enabled";
    public static final boolean PLAYER_DEPOSIT_LIMIT_COOL_DOWN_PERIOD_ENABLED_DEFAULT = true;
    // default brand area code for brand create (',' delimit)
    public static final String BRAND_AREA_CODE_DEFAULT = "+238, +250, +254, +1, +20, +86";

    public static final String BONUS_TRAN_UPDATER_JOB = "BonusTranUpdaterJob";
    public static final String RAFFLE_TICKET_UPDATER_JOB = "RaffleTicketUpdateService";
    public static final String DW_GAME_PLAY_UPDATER_JOB = "DwGamePlayUpdaterJob";

    // ssw
    public static final String SSW_AUTHENTIC_PATH = "/ps/ssw/login";
    public static final String SSW_GAME_LAUNCH_PATH = "/ps/game/GameContainer.action";
    public static final String SSW_USER_PLATFORM_SESSION_LIMIT = "_SSW_";

    public static final String SSW_BRAND_PLATFORM_NETENT_USER_NAME_DEFAULT = "NETENT_GTC";
    public static final String SSW_BRAND_PLATFORM_USER_NAME_SUF = "_GTC";
    public static final String SSW_BRAND_PLATFORM_PASSWORD_DEFAULT = "OMEGA_GTC";

    public static final String PLAYSON_SPECTATOR_GUID = "SPECTATOR_";

    // default brand sign up for brand config
    public static final HashMap<String, String> BRAND_SIGN_UP_FIELD = new HashMap<String, String>() {
        {
            put("unit", "");
            put("mobilePhone", "");
            put("phone", "");
            put("captcha", "");
            put("postalCode", "user.postalCodeAlt");
            put("securityNationalRegNumber", "user.nationalRegNumberKenyan");
            put("helpKey", "signup.emailHelpNoActivation");
            put("emailOptions", "signup.emailOptionLabel");
            put("building", "");
            put("province", "");
            put("title", "user.title");
        }
    };
    public static String DATE_FORMAT = "dd-MM-yyyy";
    public static String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss z";
    public static String DATE_TIME_SIMPLE_FORMAT = "dd-MM-yyyy HH:mm:ss";
    public static String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public static String DATE_TIME_MS_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    public static String DATEPICKER_DATE_FORMAT = "dd-mm-yy";
    public static String MONTH_FORMAT = "MM-yyyy";
    public static String YEAR_FORMAT = "yyyy";
    public static String TIME_FORMAT = "HH:mm:ss z";

    public static String[] getSecurityQuestions() {
        return new String[] {
                "First pet's name?",
                "Favourite movie?",
                "Anniversary?",
                "Father's middle name?",
                "Spouse's middle name?",
                "First child's middle name?",
                "High school name?",
                "Favourite teacher's name?",
                "Favourite sports team?",
                "Favourite Colour?",
                "What is your postcode?"
        };
    }

    /**
     * Returns the default set of spring configuration locations.
     */
    public static String[] getSpringConfigLocations() {
        return getSpringConfigLocationsNoWeb();
        /*
        String [] configs = getSpringConfigLocationsNoWeb();
        int originalLength = configs.length;
        configs = Arrays.copyOf(configs, originalLength + 2);
        configs[originalLength] = "classpath:/applicationContext-security.xml";
        configs[originalLength + 1] = "classpath:/applicationContext-web.xml";
        return configs;
        */
    }

    /**
     * Returns the set of spring configuration locations without the web
     * locations.
     */
    public static String[] getSpringConfigLocationsNoWeb() {
        return new String[]{
                "classpath:/applicationContext-resources.xml",
                "classpath:/applicationContext-dao.xml",
                "classpath:/applicationContext-service.xml",
                "classpath:/applicationContext-datasource.xml",
                "classpath:/applicationContext-job.xml"

        };
    }

    /**
     * Returns the set of spring configuration locations without the web
     * locations.
     */
    public static String[] getSpringConfigLocationsCms() {
        return new String[]{
                "classpath:/applicationContext-resources.xml",
                "classpath:/applicationContext-dao.xml",
                "classpath:/applicationContext-service.xml",
                "classpath:/applicationContext-datasource.xml",
                "classpath:/applicationContext-job.xml",
                "classpath:/applicationContext-kpi.xml"
        };
    }

    /**
     * Returns the set of spring configuration locations without the web
     * locations.
     */
    public static String[] getSpringConfigLocationsForTest() {
        return new String[]{
                "classpath:/applicationContext-resources.xml",
                "classpath:/applicationContext-dao.xml",
                "classpath:/applicationContext-service.xml",
                "classpath:/*applicationContext-datasource-test.xml",
                "classpath:/applicationContext-commons-test.xml",
                "classpath:/applicationContext-job.xml"
        };
    }

    /**
     * Returns the default set of spring configuration locations as a
     * comma separated string.
     */
    public static String getSpringConfigLocationsString() {
        StringBuilder sb = new StringBuilder();
        for (String location : getSpringConfigLocations()) {
            sb.append(location + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
