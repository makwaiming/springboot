package com.omega.commons.constants;

public class PaymentProcessingConstants {

    public final static String PAYMENT_OPTIONS_DEBIT_USE_WIRECARD = "debit.useWirecard";
    public final static String PAYMENT_OPTIONS_CREDIT_USE_PS4 = "credit.PS4";
    public final static String PAYMENT_OPTIONS_DEBIT_MAESTRO_ONLY = "debit.maestroOnly";
    public final static String PAYMENT_OPTIONS_SOFORT_USE_OGONE = "sofort.oGone";
    public final static String PAYMENT_OPTIONS_PAYSAFE_USE_OGONE = "paysafe.oGone";
    public final static String PAYMENT_OPTIONS_PAYSAFE_USE_SKRILL = "paysafe.skrill";
    public final static String PAYMENT_OPTIONS_TODOPAGO_ENABLED = "TodoPago.enabled";
    public final static String PAYMENT_OPTIONS_TODOPAGO_IP_CHECK = "TodoPago.ipcheck";
    public final static String PAYMENT_OPTIONS_PREPAYPLUS_ENABLED = "prepayplus.enabled";
    public final static String PAYMENT_OPTIONS_DISASHOP_ENABLED = "disashop.enabled";
    public final static String PAYMENT_OPTIONS_BANK_BATCH_ONLY = "bank.batchOnly";
    public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_DEPOSIT = "MailNotification.deposit";
    public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_DEPOSIT_FAILED = "MailNotification.depositFailed";
    //public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_DEPOSIT_FAILED_ADMIN = "MailNotification.depositFailed.admin";
    //public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_DEPOSIT_FAILED_USER = "MailNotification.depositFailed.user";
    public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_WITHDRAWAL = "MailNotification.withdrawal";
    public final static String PAYMENT_OPTIONS_MAIL_NOTIFICATION_WITHDRAWAL_REQUEST = "MailNotification.withdrawalRequest";
    public final static String PAYMENT_OPTIONS_MAIL_LIST = "MailNotification.mailList";
    public final static String PAYMENT_OPTIONS_MAIL_LIST_DEPOSIT_TO = "MailNotification.mailList.depositTo";
    public final static String PAYMENT_OPTIONS_REPROCESS_AVAILABLE = "ReprocessAvailable";

    public final static String MANUAL_ADJUSTMENT_SUBTYPE_KEY = "manualAdjustment.subType";
    public final static String MANUAL_ADJUSTMENT_BONUSTYPE_KEY = "manualAdjustment.bonusType";

    public final static String WITHDRAWAL_CREDIT_CREDORAX = "Withdrawal.credit.useCredoRax";
    public final static Boolean WITHDRAWAL_CREDIT_CREDORAX_DEFAULT = Boolean.FALSE;

    public final static String KEY_OGONE_URL = "oGone.URL";
    public final static String KEY_OGONE_PSID = "oGone.PSID";
    public final static String KEY_OGONE_SHA1OUT = "oGone.SHA-1-OUT";
    public final static String KEY_OGONE_SHA1IN = "oGone.SHA-1-IN";
    public final static String KEY_OGONE_SOFORT_PM = "oGone.sofort.PM";
    public final static String KEY_OGONE_SOFORT_BRAND = "oGone.sofort.Brand";
    public final static String KEY_OGONE_MAESTRO_PM = "oGone.maestro.PM";
    public final static String KEY_OGONE_MAESTRO_BRAND = "oGone.maestro.Brand";
    public final static String KEY_OGONE_PINGPING_PM = "oGone.pingping.PM";
    public final static String KEY_OGONE_PINGPING_BRAND = "oGone.pingping.Brand";
    public final static String KEY_OGONE_BANCONTACT_PM = "oGone.bancontact.PM";
    public final static String KEY_OGONE_BANCONTACT_BRAND = "oGone.bancontact.Brand";
    public final static String KEY_OGONE_CBCONLINE_PM = "oGone.cbconline.PM";
    public final static String KEY_OGONE_CBCONLINE_BRAND = "oGone.cbconline.Brand";
    public final static String KEY_OGONE_CASHTICKET_PM = "oGone.cashticket.PM";
    public final static String KEY_OGONE_CASHTICKET_BRAND = "oGone.cashticket.Brand";
    public final static String KEY_OGONE_DEXIA_PM = "oGone.dexia.PM";
    public final static String KEY_OGONE_DEXIA_BRAND = "oGone.dexia.Brand";
    public final static String KEY_OGONE_INGHOMEPAY_PM = "oGone.inghomepay.PM";
    public final static String KEY_OGONE_INGHOMEPAY_BRAND = "oGone.inghomepay.Brand";
    public final static String KEY_OGONE_PAYSAFE_PM = "oGone.paysafecard.PM";
    public final static String KEY_OGONE_PAYSAFE_BRAND = "oGone.paysafecard.Brand";
    public final static String KEY_OGONE_CANCEL_URL = "oGone.CANCEL_URL";
    public final static String KEY_OGONE_ACCEPT_URL = "oGone.ACCEPT_URL";
    public final static String KEY_OGONE_DECLINE_URL = "oGone.DECLINE_URL";
    public final static String KEY_OGONE_EXCEPTION_URL = "oGone.EXCEPTION_URL";
    public final static String KEY_OGONE_MOBILE_TEMPLATE_URL = "oGone.mobile_template_url";

    public final static String DEFAULT_OGONE_URL = "https://viveum.v-psp.com/ncol/test/orderstandard.asp";
    public final static String DEFAULT_OGONE_PSID = "win2daybe";
    public final static String DEFAULT_OGONE_SHA1OUT = "win2dayBeOut";
    public final static String DEFAULT_OGONE_SHA1IN = "win2dayBeInwin2dayBeIn";
    public final static String DEFAULT_OGONE_MAESTRO_PM = "CreditCard";
    public final static String DEFAULT_OGONE_MAESTRO_BRAND = "Maestro";
    public final static String DEFAULT_OGONE_SOFORT_PM = "DirectEbankingBE";
    public final static String DEFAULT_OGONE_PINGPING_PM = "PingPing";
    public final static String DEFAULT_OGONE_PINGPING_BRAND = "PingPing";
    public final static String DEFAULT_OGONE_BANCONTACT_PM = "CreditCard";
    public final static String DEFAULT_OGONE_BANCONTACT_BRAND = "BCMC";
    public final static String DEFAULT_OGONE_CBCONLINE_PM = "CBC Online";
    public final static String DEFAULT_OGONE_CBCONLINE_BRAND = "CBC Online";
    public final static String DEFAULT_OGONE_CASHTICKET_PM = "cashticket";
    public final static String DEFAULT_OGONE_CASHTICKET_BRAND = "cashticket";
    public final static String DEFAULT_OGONE_DEXIA_PM = "Dexia Direct Net";
    public final static String DEFAULT_OGONE_DEXIA_BRAND = "Dexia Direct Net";
    public final static String DEFAULT_OGONE_INGHOMEPAY_PM = "ING HomePay";
    public final static String DEFAULT_OGONE_INGHOMEPAY_BRAND = "ING HomePay";
    public final static String DEFAULT_OGONE_PAYSAFE_PM = "paysafecard";
    public final static String DEFAULT_OGONE_PAYSAFE_BRAND = "paysafecard";
    public final static String DEFAULT_OGONE_RESPONSE_URL = "/ps/priv/DepositOgoneResponse.action";
    public final static String DEFAULT_OGONE_MOBILE_TEMPLATE_URL = "/ps/jsp/layout/newTemplate.html";

    public final static String KEY_ECOPAYZ_URL = "MONEYBOOKERS_URL";
    public final static String KEY_ECOPAYZ_WITHDRAWAL_URL = "MONEYBOOKERS_WITHDRAWAL_URL";

    public final static String KEY_MONEYBOOKERS_URL = "MONEYBOOKERS_URL";
    public final static String KEY_MONEYBOOKERS_WITHDRAWAL_URL = "MONEYBOOKERS_WITHDRAWAL_URL";
    public final static String KEY_MONEYBOOKERS_MERCHANT_PASSWORD = "MONEYBOOKERS_MERCHANT_PASSWORD";
    public final static String KEY_MONEYBOOKERS_RETURN_URL = "MONEYBOOKERS_RETURN_URL";
    public final static String KEY_MONEYBOOKERS_PAYTOEMAIL = "MONEYBOOKERS_PAYTOEMAIL";
    public final static String KEY_MONEYBOOKERS_RECIPIENT_DESCRIPTION = "MONEYBOOKERS_RECIPIENT_DESCRIPTION";
    public final static String KEY_MONEYBOOKERS_CANCEL_URL = "MONEYBOOKERS_CANCEL_URL";
    public final static String KEY_MONEYBOOKERS_STATUS_URL = "MONEYBOOKERS_STATUS_URL";
    public final static String KEY_MONEYBOOKERS_LANGUAGE = "MONEYBOOKERS_LANGUAGE";
    public final static String KEY_MONEYBOOKERS_DETAIL_DESC = "MONEYBOOKERS_DETAIL_DESC";
    public final static String KEY_MONEYBOOKERS_DETAIL_TEXT = "MONEYBOOKERS_DETAIL_TEXT";
    public final static String KEY_MONEYBOOKERS_URL_TARGET = "MONEYBOOKERS_URL_TARGET";
    public final static String KEY_1_TAP_URL = "SKRILL_1_TAP_URL";
    public final static String KEY_1_TAP_PASSWORD = "SKRILL_1_TAP_PASSWORD";
    public final static String KEY_1_TAP_PAYTOEMAIL = "SKRILL_1_TAP_PAYTOEMAIL";


    public final static String DEFAULT_MONEYBOOKERS_URL = "https://www.moneybookers.com/app/payment.pl";
    public final static String DEFAULT_MONEYBOOKERS_WITHDRAWAL_URL = "https://www.moneybookers.com/app/pay.pl";
    public final static String DEFAULT_MONEYBOOKERS_RETURN_URL = "/ps/priv/DepositMoneybookersReturn.action";
    public final static String DEFAULT_MONEYBOOKERS_CANCEL_URL = "/ps/priv/DepositMoneybookersCancel.action";
    public final static String DEFAULT_MONEYBOOKERS_STATUS_URL = "/ps/pub/DepositMoneybookersStatus.action";
    public final static String DEFAULT_MONEYBOOKERS_LANGUAGE = "EN";
    public final static String DEFAULT_MONEYBOOKERS_DETAIL_DESC = "Purchase chips via Moneybookers";
    public final static String DEFAULT_MONEYBOOKERS_DETAIL_TEXT = "Purchase";
    public final static String DEFAULT_MONEYBOOKERS_URL_TARGET = "1";
    public final static String DEFAULT_1_TAP_URL = "https://www.moneybookers.com/app/ondemand_request.pl";

    public final static String OTOPAY_URL = "otopay.url";
    public final static String DEFAULT_OTOPAY_URL = "https://api.otopaygateway.com";
    public final static String OTOPAY_VERSION = "otopay.version";
    public final static String DEFAULT_OTOPAY_VERSION = "v1";
    public final static String OTOPAY_APIKEY = "otopay.apiKey";
    public final static String DEFAULT_OTOPAY_APIKEY = "op_test_5GTzW7nG3vzyPCQC2JzifucP8hwr";

    public final static String NETELLER_USE_NEW_API = "neteller.useNewAPI";
    public final static String NETELLER_URL = "neteller.url";
    public final static String NETELLER_URL_DEFAULT = "https://test.api.neteller.com/v1";
    public final static String NETELLER_TOKEN_APPLICATION_CONTEXT = "neteller.token.applicationContext";
    public final static String NETELLER_TOKEN_APPLICATION_CONTEXT_DEFAULT = "/oauth2/token?grant_type=client_credentials";
    public final static String NETELLER_DEPOSIT_APPLICATION_CONTEXT = "neteller.deposit.applicationContext";
    public final static String NETELLER_DEPOSIT_APPLICATION_CONTEXT_DEFAULT = "/transferIn";
    public final static String NETELLER_WITHDRAWAL_APPLICATION_CONTEXT = "neteller.withdrawal.applicationContext";
    public final static String NETELLER_WITHDRAWAL_APPLICATION_CONTEXT_DEFAULT = "/transferOut";
    public final static String NETELLER_CLIENT_ID = "neteller.clientId";
    public final static String NETELLER_CLIENT_SECRET = "neteller.clientSecret";

    public final static String NETELLER_MERCHANT_ID = "NETELLER_MERCHANT_ID";
    public final static String NETELLER_MERCHANT_KEY = "NETELLER_MERCHANT_KEY";
    public final static String NETELLER_MERCHANT_PASSWORD = "NETELLER_MERCHANT_PASSWORD";
    public final static String NETELLER_DEPOSIT_URL = "NETELLER_DEPOSIT_URL";
    public final static String NETELLER_DEPOSIT_URL_DEFAULT = "https://test.api.neteller.com/netdirect";
    public final static String NETELLER_WITHDRAWAL_URL = "NETELLER_WITHDRAWAL_URL";
    public final static String NETELLER_WITHDRAWAL_URL_DEFAULT = "https://test.api.neteller.com/instantpayout";
    public final static String NETELLER_LIVE_API_URL = "NETELLER_LIVE_API_URL";
    public final static String NETELLER_LIVE_API_URL_DEFAULT = "https://royalpanda-liveapi-test.casinomodule.com/lobbycomm/services/LobbyApi/tables/allOpen/royalpanda/";

    public final static String KEY_KENSWITCH_URL = "KENSWITCH_URL";
    public final static String DEFAULT_KENSWITCH_URL = "https://www.kenswitch.com/KenswitchPaymentGateway/KenswitchPaymentGateway.aspx";
    public final static String KEY_KENSWITCH_AUTH = "KENSWITCH_AUTH";
    public final static String DEFAULT_KENSWITCH_AUTH = "http://41.215.139.59:8080/KenswitchWebServiceAuthTransaction/AuthTransaction";
    public final static String KEY_KENSWITCH_TOKEN = "KENSWITCH_TOKEN";
    public final static String KEY_KENSWITCH_MERCHANT_ID = "KENSWITCH_MERCHANT_ID";
    public final static String KEY_KENSWITCH_MERCHANT_NAME = "KENSWITCH_MERCHANT_NAME";
    public final static String KEY_KENSWITCH_SECRET = "KENSWITCH_SECRET";
    public final static String KEY_KENSWITCH_EMAIL = "KENSWITCH_EMAIL";

    public final static String KEY_MPESA_TXTTO = "MPESA_TXTTO";
    public final static String KEY_AIRTEL_TXTTO = "AIRTEL_TXTTO";
    public final static String KEY_ELMA_TXTTO = "ELMA_TXTTO";
    public final static String KEY_YUCASH_TXTTO = "YUCASH_TXTTO";

    public final static String KEY_RBS_FORCE_STORE = "RBS_FORCE_STORE_CARD";
    public final static String KEY_RBS_3D_TERM_URL = "RBS_3D_TERM_URL";
    public final static String DEFAULT_RBS_3D_TERM_URL = "/ps/priv/Deposit3Da.action";

    public final static String DEPOSIT_LINK_CREDITCARD = "/ps/priv/DoDepositCreditCard.action";
    public final static String DEPOSIT_LINK_CREDORAX = "/ps/priv/DoDepositCredoRax.action";
    public final static String DEPOSIT_LINK_ENVOY = "/ps/priv/DoDepositEnvoy.action";
    public final static String DEPOSIT_LINK_HIPAY = "/ps/priv/DoDepositHipay.action?cardBrand=hipay";
    public final static String DEPOSIT_LINK_HIPAY_VISA = "/ps/priv/DoDepositHipay.action?cardBrand=visa";
    public final static String DEPOSIT_LINK_HIPAY_MASTERCARD = "/ps/priv/DoDepositHipay.action?cardBrand=mastercard";
    public final static String DEPOSIT_LINK_HIPAY_MAESTRO = "/ps/priv/DoDepositHipay.action?cardBrand=maestro";
    public final static String DEPOSIT_LINK_DEBIT = "/ps/priv/DoDepositDebit.action";
    public final static String DEPOSIT_LINK_OGONE_MAESTRO = "/ps/priv/DoDepositOgone.action?cardBrand=Maestro";
    public final static String DEPOSIT_LINK_DIRECTDEBIT = "/ps/priv/DoDepositDirectDebit.action";
    public final static String DEPOSIT_LINK_MONEYBOOKERS = "/ps/priv/DoDepositMoneybookers.action";
    public final static String DEPOSIT_LINK_NETELLER = "/ps/priv/DoDepositNeteller.action";
    public final static String DEPOSIT_LINK_PAYSAFE = "/ps/priv/DoDepositPaysafe.action";
    public final static String DEPOSIT_LINK_OGONE_BANCONTACT = "/ps/priv/DoDepositOgone.action?cardBrand=Bancontact";
    public final static String DEPOSIT_LINK_OGONE_CBCONLINE = "/ps/priv/DoDepositOgone.action?cardBrand=CBCOnline";
    public final static String DEPOSIT_LINK_OGONE_CASHTICKET = "/ps/priv/DoDepositOgone.action?cardBrand=CashTicket";
    public final static String DEPOSIT_LINK_OGONE_DEXIA = "/ps/priv/DoDepositOgone.action?cardBrand=DexiaDirectNet";
    public final static String DEPOSIT_LINK_OGONE_INGHOMEPAY = "/ps/priv/DoDepositOgone.action?cardBrand=INGHomePay";
    public final static String DEPOSIT_LINK_OGONE_PINGPING = "/ps/priv/DoDepositOgone.action?cardBrand=PingPing";
    public final static String DEPOSIT_LINK_KENSWITCH = "/ps/priv/DoDepositKenswitch.action";
    public final static String DEPOSIT_LINK_MPESA = "/ps/priv/DoDepositMPESA.action";
    public final static String DEPOSIT_LINK_AIRTEL = "/ps/priv/DoDepositAirtel.action";
    public final static String DEPOSIT_LINK_YUCASH = "/ps/priv/DoDepositYucash.action";
    public final static String DEPOSIT_LINK_ELMA = "/ps/priv/DoDepositElma.action";
    public final static String DEPOSIT_LINK_TODOPAGO = "/ps/priv/DoDepositTodoPago.action";
    public final static String DEPOSIT_LINK_PREPAYPLUS = "/ps/priv/DoDepositPrepayPlus.action";
    public final static String DEPOSIT_LINK_BANK = "/ps/priv/DoDepositBankWire.action";
    public final static String DEPOSIT_LINK_BANK_RESERVAS = "/ps/priv/DoDepositBankWire.action?bank=reservas";
    public final static String DEPOSIT_LINK_BANK_POPULAR = "/ps/priv/DoDepositBankWire.action?bank=popular";
    public final static String DEPOSIT_LINK_BANK_VIMENCA = "/ps/priv/DoDepositBankWire.action?bank=vimenca";
    public final static String DEPOSIT_LINK_BANK_OTHERS = "/ps/priv/DoDepositBankWire.action?bank=others";
    public final static String DEPOSIT_LINK_CANCELWITHDRAWAL = "/ps/priv/BankingHistory.action?pendingWithdrawalOnly=true";
    public final static String DEPOSIT_LINK_EASYDEBIT = "/ps/priv/DoDepositPromote.action?cardBrand=EasyDebit";
    public final static String DEPOSIT_LINK_PAYDIRECT = "/ps/priv/DoDepositPromote.action?cardBrand=PayDirect";
    public final static String DEPOSIT_LINK_DISASHOP = "/ps/priv/DoDepositDisashop.action";
    public final static String DEPOSIT_LINK_UK_UKASH = "/ps/priv/DoDepositUKash.action";
    public final static String DEPOSIT_LINK_ECO_PAYZ = "/ps/priv/DoDepositEcoPayz.action";
    public final static String DEPOSIT_LINK_VAMEX_VISA = "/ps/priv/DoDepositVamex.action?vamexType=VAMEX_VISA";
    public final static String DEPOSIT_LINK_VAMEX_MC   = "/ps/priv/DoDepositVamex.action?vamexType=VAMEX_MC";
    public final static String DEPOSIT_LINK_VAMEX_VISA_SMARTCHK = "/ps/priv/DoDepositVamex.action?vamexType=VAMEX_VISA_SMARTCHK";
    public final static String DEPOSIT_LINK_VAMEX_MC_SMARTCHK   = "/ps/priv/DoDepositVamex.action?vamexType=VAMEX_MC_SMARTCHK";
    public final static String DEPOSIT_LINK_REDBARON_VISA   = "/ps/priv/DoDepositRedBaron.action?type=REDBARON_VISA";
    public final static String DEPOSIT_LINK_REDBARON_MC   = "/ps/priv/DoDepositRedBaron.action?type=REDBARON_MC";
    public final static String DEPOSIT_LINK_WIRECARD_CCARD        = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_CCARD";
    public final static String DEPOSIT_LINK_WIRECARD_CCARD_MOTO   = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_CCARD_MOTO";
    public final static String DEPOSIT_LINK_WIRECARD_EKONTO       = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_EKONTO";
    public final static String DEPOSIT_LINK_WIRECARD_GIROPAY      = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_GIROPAY";
    public final static String DEPOSIT_LINK_WIRECARD_MONETA       = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_MONETA";
    public final static String DEPOSIT_LINK_WIRECARD_PRZELEWY24   = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_PRZELEWY24";
    public final static String DEPOSIT_LINK_WIRECARD_PAYPAL       = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_PAYPAL";
    public final static String DEPOSIT_LINK_WIRECARD_POLI         = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_POLI";
    public final static String DEPOSIT_LINK_WIRECARD_PAYSAFECARD  = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_PAYSAFECARD";
    public final static String DEPOSIT_LINK_WIRECARD_SEPA_DD      = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_SEPA_DD";
    public final static String DEPOSIT_LINK_WIRECARD_SKRILLDIRECT = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_SKRILLDIRECT";
    public final static String DEPOSIT_LINK_WIRECARD_SKRILLWALLET = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_SKRILLWALLET";
    public final static String DEPOSIT_LINK_WIRECARD_SOFORT       = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_SOFORT";
    public final static String DEPOSIT_LINK_WIRECARD_TRUSTLY      = "/ps/priv/DoDepositWirecard.action?paymentMethod=WC_TRUSTLY";
    public final static String DEPOSIT_LINK_COMPRAFACIL_MULTIBANCO = "/ps/priv/DoDepositCompraFacil.action";
    public final static String DEPOSIT_LINK_SKRILL_PAYSAFECARD    = "/ps/priv/DoDepositSkrill.action?type=SK_PAYSAFECARD";
    public final static String DEPOSIT_LINK_ASTROPAY                = "/ps/priv/DoDepositAstropay.action";
    public final static String DEPOSIT_LINK_EPRO                    = "/ps/priv/DoDepositEPro.action";
    public final static String DEPOSIT_LINK_EPAYCODE                = "/ps/priv/DoDepositEPayCode.action";
    public final static String DEPOSIT_LINK_IB_IBANQ                = "/ps/priv/DoDepositIBanq.action";
    public final static String DEPOSIT_LINK_VP_VENUSPOINT           = "/ps/priv/DoDepositVenusPoint.action";
    public final static String DEPOSIT_LINK_PAYKWIK                 = "/ps/priv/DoDepositPayKwik.action";
    public final static String DEPOSIT_LINK_INPAY                   = "/ps/priv/DoDepositInpay.action";
    public final static String DEPOSIT_LINK_HIPAY_SOAP              = "/ps/priv/DoDepositHipaySoap.action";
    public final static String DEPOSIT_LINK_OTOPAY                  = "/ps/priv/DoDepositOtopay.action";

    public final static String DEPOSIT_LINK_ECP_MOBILECOMMERCE      = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_MOBILECOMMERCE";
    public final static String DEPOSIT_LINK_ECP_QIWI                = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_QIWI";
    public final static String DEPOSIT_LINK_ECP_YANDEXMONEY         = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_YANDEXMONEY";
    public final static String DEPOSIT_LINK_ECP_CONTACT24           = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_CONTACT24";
    public final static String DEPOSIT_LINK_ECP_COMEPAY             = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_COMEPAY";
    public final static String DEPOSIT_LINK_ECP_BOLETO              = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_BOLETO";
    public final static String DEPOSIT_LINK_ECP_CUP                 = "/ps/priv/DoDepositEcommpay.action?paymentMethod=ECP_CUP";

    public final static String DEPOSIT_LINK_PAGO_SIMPLEPAYMENT      = "/ps/priv/DoDepositPago.action?paymentMethod=PAGO_SIMPLEPAYMENT";

    public final static String DEPOSIT_LINK_IS_VISA                = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_VISA";
    public final static String DEPOSIT_LINK_IS_SOFORT              = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_SOFORT";
    public final static String DEPOSIT_LINK_IS_BANKTRANSFER        = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_BANKTRANSFER";
    public final static String DEPOSIT_LINK_IS_INSTANTBANK         = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_INSTANTBANK";
    public final static String DEPOSIT_LINK_IS_GIFTCARD            = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_GIFTCARD";
    public final static String DEPOSIT_LINK_IS_IDEAL               = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_IDEAL";
    public final static String DEPOSIT_LINK_IS_CUP                 = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_CUP";
    public final static String DEPOSIT_LINK_IS_SEPA                = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_SEPA";
    public final static String DEPOSIT_LINK_IS_CEPBANK             = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_CEPBANK";
    public final static String DEPOSIT_LINK_IS_JETON               = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_JETON";
    public final static String DEPOSIT_LINK_IS_CASHIXIR            = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_CASHIXIR";
    public final static String DEPOSIT_LINK_IS_PAYKASA             = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_PAYKASA";
    public final static String DEPOSIT_LINK_IS_EPAYCODE            = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_EPAYCODE";
    public final static String DEPOSIT_LINK_IS_GSCASH              = "/ps/priv/DoDepositISettle.action?paymentMethod=IS_GSCASH";

    public final static String DEPOSIT_LINK_ALW = "/ps/priv/DoDepositALW.action";
    public final static String DEPOSIT_LINK_WPHPP_VISA   = "/ps/priv/DoDepositWorldpayHPP.action?cardType=VISA";

    public final static String DEPOSIT_BANK = "deposit.bank";
    public final static String DEPOSIT_BANK_RESERVAS = "deposit.bank.reservas";
    public final static String DEPOSIT_BANK_POPULAR = "deposit.bank.popular";
    public final static String DEPOSIT_BANK_VIMENCA = "deposit.bank.vimenca";
    public final static String DEPOSIT_BANK_OTHERS = "deposit.bank.others";
    public final static String DEPOSIT_CHECK = "deposit.check";
    public final static String DEPOSIT_KENSWITCH = "deposit.kenswitch";
    public final static String DEPOSIT_MONEYBOOKERS = "deposit.moneybookers";
    public final static String DEPOSIT_CREDITCARD = "deposit.creditCard";
    public final static String DEPOSIT_DEBITCARD = "deposit.debitCard";
    public final static String DEPOSIT_MPESA = "deposit.mpesa";
    public final static String DEPOSIT_NETELLER = "deposit.neteller";
    public final static String DEPOSIT_AIRTEL = "deposit.airtel";
    public final static String DEPOSIT_YUCASH = "deposit.yucash";
    public final static String DEPOSIT_ELMA = "deposit.elma";
    public final static String DEPOSIT_DIRECTDEBIT = "deposit.directDebit";
    public final static String DEPOSIT_PAYSAFE = "deposit.paysafe";
    public final static String DEPOSIT_OGONE_MAESTRO = "deposit.oGoneMaestro";
    public final static String DEPOSIT_PINGPING = "deposit.PingPing";
    public final static String DEPOSIT_BANCONTACT = "deposit.Bancontact";
    public final static String DEPOSIT_CBCONLINE = "deposit.CBCOnline";
    public final static String DEPOSIT_CASHTICKET = "deposit.CashTicket";
    public final static String DEPOSIT_DEXIA = "deposit.DexiaDirectNet";
    public final static String DEPOSIT_INGHOMEPAY = "deposit.INGHomePay";
    public final static String DEPOSIT_TODOPAGO = "deposit.todopago";
    public final static String DEPOSIT_CREDORAX = "deposit.CredoRax";
    public final static String DEPOSIT_HIPAY = "deposit.hipay";
    public final static String DEPOSIT_HIPAY_VISA = "deposit.hipay.visa";
    public final static String DEPOSIT_HIPAY_MASTERCARD = "deposit.hipay.mastercard";
    public final static String DEPOSIT_HIPAY_MAESTRO = "deposit.hipay.maestro";
    public final static String DEPOSIT_EASYDEBIT = "deposit.easydebit";
    public final static String DEPOSIT_PAYDIRECT = "deposit.paydirect";
    public final static String DEPOSIT_PREPAYPLUS = "deposit.prepayplus";
    public final static String DEPOSIT_DISASHOP = "deposit.disashop";
    public final static String DEPOSIT_CANCELWITHDRAWAL = "deposit.cancelWithdrawal";
    public final static String DEPOSIT_ENVOY = "deposit.envoy";
    public final static String DEPOSIT_UKASH = "deposit.uKash";
    public final static String DEPOSIT_UK_UKASH = "deposit.uKUKash";
    public final static String DEPOSIT_ECOPAYZ = "deposit.ecoPayz";
    public final static String DEPOSIT_VAMEX_VISA = "deposit.vamex.visa";
    public final static String DEPOSIT_VAMEX_MC = "deposit.vamex.mc";
    public final static String DEPOSIT_VAMEX_VISA_SMARTCHK = "deposit.vamex.visa.smartchk";
    public final static String DEPOSIT_VAMEX_MC_SMARTCHK = "deposit.vamex.mc.smartchk";
    public final static String DEPOSIT_WIRECARD = "deposit.wirecard";

    public final static String WITHDRAW_CASH = "withdraw.cash";
    public final static String WITHDRAW_BANK = "withdraw.bank";
    public final static String WITHDRAW_BANK_DO = "withdraw.bank.do";
    public final static String WITHDRAW_CHECK = "withdraw.check";
    public final static String WITHDRAW_MONEYBOOKERS = "withdraw.moneybookers";
    public final static String WITHDRAW_CREDITCARD = "withdraw.creditCard";
    public final static String WITHDRAW_DEBITCARD = "withdraw.debitCard";
    public final static String WITHDRAW_NETELLER = "withdraw.neteller";
    public final static String WITHDRAW_MPESA = "withdraw.mpesa";
    public final static String WITHDRAW_AIRTEL = "withdraw.airtel";
    public final static String WITHDRAW_YUCASH = "withdraw.yucash";
    public final static String WITHDRAW_MMT = "withdraw.mobilemoneytransfer";
    public final static String WITHDRAW_TODOPAGO = "withdraw.todopago";
    public final static String WITHDRAW_ENVOY = "withdraw.envoy";
    public final static String WITHDRAW_UKASH = "withdraw.uKash";
    public final static String WITHDRAW_UK_UKASH = "withdraw.uKUKash";
    public final static String WITHDRAW_ECOPAYZ = "withdraw.ecoPayz";

    public final static String KEY_TODOPAGO_LOCATION_CODE = "todopago.locationCode";

    public final static String KEY_BANKINFO_USEIBAN = "bankTransfer.useIBAN";
    public final static String KEY_BANKINFO_USEBIC = "bankTransfer.useBIC";
    public final static String KEY_BANKINFO_USEACCOUNTNUMBER = "bankTransfer.useAccountNumber";
    public final static String KEY_BANKINFO_USEACCOUNTTYPE = "bankTransfer.useAccountType";
    public final static String KEY_BANKINFO_USEBANKNAME = "bankTransfer.useBankName";
    public final static String KEY_BANKINFO_USE_DR_BANK_CODE = "bankTransfer.useDRBankCode";

    public final static String KEY_CREDORAX_MERCHANTID = "CredoRax.MerchantID";
    public final static String KEY_CREDORAX_PROFILEID = "CredoRax.ProfileId";
    public final static String KEY_CREDORAX_SIGNATUREKEY = "CredoRax.MerchantSignatureKey";
    public final static String KEY_CREDORAX_URL = "CredoRax.URL";
    public final static String KEY_CREDORAX_GATEWAY_URL = "CredoRax.GatewayURL";
    public final static String KEY_CREDORAX_WITHDRAW_DESC = "CredoRax.withdrawal.description";

    public final static String DEFAULT_CREDORAX_MERCHANTID = "47060542";
    public final static String DEFAULT_CREDORAX_PROFILEID = "";
    public final static String DEFAULT_CREDORAX_SIGNATUREKEY = "26785216";
    public final static String DEFAULT_CREDORAX_URL = "https://test-bos.hpp.credorax.com/hpp/checkout";//"https://base2.credorax.com/hpp/checkout";
    public final static String DEFAULT_CREDORAX_GATEWAY_URL = "https://base2.credorax.com/intenv/service/gateway";
    public final static String DEFAULT_CREDORAX_WITHDRAW_DESC = "Winnings Withdrawal";

    public final static String KEY_ENVOY_URL = "envoy.url";
    public final static String DEFAULT_ENVOY_URL = "https://test.envoytransfers.com";
    public final static String KEY_ENVOY_SERVICENAME = "envoy.servicename";
    public final static String DEFAULT_ENVOY_SERVICENAME = "Payment using Envoy";
    public final static String KEY_ENVOY_MERCHANTID = "envoy.merchantId";
    public final static String DEFAULT_ENVOY_MERCHANTID = "000807OMG";
    public final static String KEY_ENVOY_SOAPACTION_PAYIN = "envoy.SOAPAction.payin";
    public final static String DEFAULT_ENVOY_SOAPACTION_PAYIN = "http://merchantapi.envoyservices.com/payInConfirmation";
    public final static String KEY_ENVOY_SOAPACTION_REFUND = "envoy.SOAPAction.refund";
    public final static String DEFAULT_ENVOY_SOAPACTION_REFUND = "http://merchantapi.envoyservices.com/refundPayin";

    public final static String KEY_ENVOY_SOAPURL = "envoy.SOAPURL";
    public final static String DEFAULT_ENVOY_SOAPURL = "https://testapi.envoyservices.com/MerchantAPI/MerchantAPI.asmx";
    public final static String KEY_ENVOY_SOAPUSERNAME = "envoy.SOAPUsername";
    public final static String DEFAULT_ENVOY_SOAPUSERNAME = "peter@omegagaming.com";
    public final static String KEY_ENVOY_SOAPPASSWORD = "envoy.SOAPPassword";
    public final static String DEFAULT_ENVOY_SOAPPASSWORD = "om3gag@ming";
    public final static String KEY_ENVOY_RETURNURL = "envoy.returnUrl";
    public final static String DEFAULT_ENVOY_RETURNURL = "/ps/priv/DepositEnvoyReturn.action";

//    public final static String KEY_REDBARON_URL = "redbaron.url";
//    public final static String DEFAULT_REDBARON_URL = "https://secure.redbaronpayments.com/secure/txHandler.php";
    public final static String KEY_REDBARON_SID = "redbaron.sid";
    public final static String DEFAULT_REDBARON_SID = "281";
    public final static String KEY_REDBARON_RCODE = "redbaron.rcode";
    public final static String DEFAULT_REDBARON_RCODE = "40befa89bbcf32bf538f82b358b7248923f368db";
    public final static String KEY_REDBARON_REDIRECT_URL = "redbaron.redirect_url";
    public final static String DEFAULT_REDBARON_REDIRECT_URL = "/ps/priv/DepositRedBaronReturn.action";
    public final static String KEY_REDBARON_POSTBACK_URL = "redbaron.postback_url";
    public final static String DEFAULT_REDBARON_POSTBACK_URL = "/ps/priv/DepositRedBaronReturn.action?postback=true";

    public final static String KEY_PAYKWIK_NOTIFY_SECRET_PASSWORD     = "paykwik.notify.secret.password";
    public final static String DEFAULT_PAYKWIK_NOTIFY_SECRET_PASSWORD = "dk982hfijdADVxAQa02N7xIa";
    public final static String KEY_PAYKWIK_IDPARTNER     = "paykwik.idPartner";
    public final static String DEFAULT_PAYKWIK_IDPARTNER = "107";
    public final static String KEY_PAYKWIK_TXHANDLER_URL     = "paykwik.gateway.url";
    public final static String DEFAULT_PAYKWIK_TXHANDLER_URL = "https://www.PayKwik.net/stageGateway.php";

    public final static String KEY_WIRECARD_CUSTOMER_ID = "wirecard.customerId";
    public final static String DEFAULT_WIRECARD_CUSTOMER_ID = "D200001";

    public final static String KEY_WIRECARD_SHOP_ID = "wirecard.shopId";
    public final static String DEFAULT_WIRECARD_SHOP_ID = "";
    public final static String KEY_WIRECARD_RETURN_URL = "wirecard.returnUrl";
    public final static String DEFAULT_WIRECARD_RETURN_URL = "/ps/priv/DepositWirecardReturn.action";
    public final static String KEY_WIRECARD_SECRET = "wirecard.secret";
    public final static String DEFAULT_WIRECARD_SECRET = "B8AKTPWBRMNBV455FG6M2DANE99WU2";


    public final static String KEY_COMPRAFACIL_USERNAME = "compraFacil.username";
    public final static String DEFAULT_COMPRAFACIL_USERNAME = "offside";
    public final static String KEY_COMPRAFACIL_PASSWORD = "compraFacil.password";
    public final static String DEFAULT_COMPRAFACIL_PASSWORD = "offside";
    public final static String KEY_COMPRAFACIL_WEB_SERVICE = "compraFacil.webservice";
    public final static String DEFAULT_COMPRAFACIL_WEB_SERVICE = "https://hm.comprafacil.pt/SIBSClick2teste/webservice/CompraFacilWS.asmx";
    public final static String KEY_COMPRAFACIL_CALLBACK_URL = "compraFacil.callbackUrl";
    public final static String DEFAULT_COMPRAFACIL_CALLBACK_URL = "/ps/pub/DepositCompraFacilCallback.action";
    public final static String KEY_COMPRAFACIL_TIME_LIMIT_DAYS = "compraFacil.timeLimitDays";
    public final static int    DEFAULT_COMPRAFACIL_TIME_LIMIT_DAYS = 3;


//    public final static String ENVOY_WORLDPLAY_API_URL = "Envoy.WorldPlayAPI.Url";
//    public final static String ENVOY_WORLDPLAY_API_USERNAME = "Envoy.WorldPlayAPI.username";
//    public final static String DEFAULT_ENVOY_WORLDPLAY_API_USERNAME = "daryl@omegagaming.com";
//    public final static String ENVOY_WORLDPLAY_API_PASSWORD = "Envoy.WorldPlayAPI.password";
//    public final static String DEFAULT_ENVOY_WORLDPLAY_API_PASSWORD = "meatloaf1";

//    public final static String KEY_ENVOY_BANK_DATA_CAPTURE_URL = "envoy.bankDataCapture.url";
//    public final static String DEFAULT_ENVOY_BANK_DATA_CAPTURE_URL = "http://test.envoytransfers.com";

    public final static String KEY_ENVOY_CUSTOMERREF = "envoy.customerRef";
    public final static String DEFAULT_ENVOY_CUSTOMERREF = "OMG";

    public final static String KEY_PROMOTE_URL = "promote.URL";
    public final static String DEFAULT_PROMOTE_URL = "https://www.sprinter22-3c.com/qekizalw.php";
    public final static String KEY_PROMOTE_PASSWORD = "promote.Password";
    public final static String DEFAULT_PROMOTE_PASSWORD = "stU9u2asecu9";
    public final static String KEY_PROMOTE_CALLBACKURL = "promote.callbackurl";
    public final static String DEFAULT_PROMOTE_CALLBACKURL = "/ps/pub/DepositPromoteCallback.action";

    public final static String KEY_EASYDEBIT_METHODID = "easydebit.methodid";
    public final static String DEFAULT_EASYDEBIT_METHODID = "5550";
    public final static String KEY_EASYDEBIT_PROFILEID = "easydebit.profileid";
    public final static String DEFAULT_EASYDEBIT_PROFILEID = "545";

    public final static String KEY_PAYDIRECT_METHODID = "paydirect.methodid";
    public final static String DEFAULT_PAYDIRECT_METHODID = "5560";
    public final static String KEY_PAYDIRECT_PROFILEID = "paydirect.profileid";
    public final static String DEFAULT_PAYDIRECT_PROFILEID = "545";

    public final static String BATCH_ISABEL = "batch.ISABEL";
    public final static String BATCH_GANEGRANDE = "batch.GaneGrande";

    public final static String ISABEL_INITIATING_PARTY_NAME = "ISABEL.InitiatingParty.Name";
    public final static String ISABEL_INITIATING_PARTY_ID = "ISABEL.InitiatingParty.Id";
    public final static String ISABEL_INITIATING_PARTY_ISSUER = "ISABEL.InitiatingParty.Issuer";
    public final static String ISABEL_DEBITOR_NAME = "ISABEL.Debtor.Name";
    public final static String ISABEL_DEBITOR_IBAN = "ISABEL.Debtor.IBAN";
    public final static String ISABEL_DEBITOR_BIC = "ISABEL.Debtor.BIC";

    public final static String BATCH_GANEGRANDE_HEADER1 = "batch.GaneGrande.Header1";
    public final static String BATCH_GANEGRANDE_HEADER2 = "batch.GaneGrande.Header2";
    public final static String BATCH_GANEGRANDE_DESCRIPTION = "batch.GaneGrande.Description";

    public final static String BATCH_GANEGRANDE_HEADER1_DEFAULT = "130122849 1";
    public final static String BATCH_GANEGRANDE_HEADER2_DEFAULT = "100012400153412     06";
    public final static String BATCH_GANEGRANDE_DESCRIPTION_DEFAULT = "GANEGRANDE";


    public final static String WIRECARD_PATH_TO_QTILL_PROPERTY = "WIRECARD.path.to.qtill.properties";
    public final static String WIRECARD_MERCHANT_KEY = "WIRECARD.merchantKey";
    public final static String WIRECARD_ORDER_DESCRIPTION = "WIRECARD.orderDescription";
    public final static String WIRECARD_DIRECTDEBIT_RETURN_URL = "WIRECARD.directdebit.returnUrl";
    public final static String WIRECARD_PAYSAFE_RETURN_URL = "WIRECARD.paysafe.returnUrl";
    public final static String WIRECARD_3D_TERM_URL = "WIRECARD.3D_TERM_URL";

    public final static String WIRECARD_PATH_TO_QTILL_PROPERTY_DEFAULT = "C:\\Documents and Settings\\eddie\\My Documents\\QTill\\qtill.properties";
    public final static String WIRECARD_MERCHANT_KEY_DEFAULT = "42BwC.gnphHTvT.HE03fNi138LPryRoUD2VD4EvKRoZjLKI78_";
    public final static String WIRECARD_ORDER_DESCRIPTION_DEFAULT = "Make a deposit";
    public final static String WIRECARD_DIRECTDEBIT_RETURN_URL_DEFAULT = "/ps/priv/DepositDirectDebitReturn.action";
    public final static String WIRECARD_PAYSAFE_RETURN_URL_DEFAULT = "/ps/priv/DepositPaysafeReturn.action";
    public final static String WIRECARD_3D_TERM_URL_DEFAULT = "/ps/priv/Deposit3DaWirecard.action";


    public final static String MPESA_TARGET_NAMESPACE = "MPESA_TARGET_NAMESPACE";
    public final static String MPESA_DEPOSIT_URL = "MPESA_DEPOSIT_URL";

    public final static String MPESA_TARGET_NAMESPACE_DEFAULT = "http://localhost:8088/src/MobilePaymentService";
    public final static String MPESA_DEPOSIT_URL_DEFAULT = "http://41.215.81.62:8088/src/MobilePaymentService";

    //MPI_NOT_AVAILABLE 4614 and 4618
    public final static String  RBS_3D_MPI_ERRORS_IS_FINE = "RBS_3D_MPI_ERRORS_IS_FINE";

    public final static String RBS_3D_URL = "RBS_3D_URL";
    public final static String RBS_3D_URL_DEFAULT = "https://trx9.wpstn.com/stlinkssl/stlink.dll";
    public final static String RBS_3D_STORE_ID = "RBS_3D_STORE_ID_";
    //    public final static String RBS_3D_STORE_ID_USD = "RBS_3D_STORE_ID_USD";
//    public final static String RBS_3D_STORE_ID_GBP = "RBS_3D_STORE_ID_GBP";
//    public final static String RBS_3D_STORE_ID_EUR = "RBS_3D_STORE_ID_EUR";
    public final static String RBS_PT_STORE_ID = "RBS_PT_STORE_ID_";
    //    public final static String RBS_PT_STORE_ID_USD = "RBS_PT_STORE_ID_USD";
//    public final static String RBS_PT_STORE_ID_GBP = "RBS_PT_STORE_ID_GBP";
//    public final static String RBS_PT_STORE_ID_EUR = "RBS_PT_STORE_ID_EUR";
//    public final static String RBS_PT_STORE_ID_MAESTRO = "RBS_PT_STORE_ID__CURRENCY__MAESTRO";
//    public final static String RBS_PT_STORE_ID_GBP_MAESTRO = "RBS_PT_STORE_ID_GBP_MAESTRO";
//    public final static String RBS_PT_STORE_ID_EUR_MAESTRO = "RBS_PT_STORE_ID_EUR_MAESTRO";
//    public final static String RBS_PT_STORE_ID_USD_MAESTRO = "RBS_PT_STORE_ID_USD_MAESTRO";
    public final static String RBS_PAYOUT_STORE_ID = "RBS_PAYOUT_STORE_ID_";
    //    public final static String RBS_PAYOUT_STORE_ID_USD = "RBS_PAYOUT_STORE_ID_USD";
//    public final static String RBS_PAYOUT_STORE_ID_EUR = "RBS_PAYOUT_STORE_ID_EUR";
//    public final static String RBS_PAYOUT_STORE_ID_GBP = "RBS_PAYOUT_STORE_ID_GBP";
    public final static String RBS_REFUND_STORE_ID = "RBS_REFUND_STORE_ID_";
    public final static String RBS_PAYOUT_MERCHANT_ID = "RBS_PAYOUT_MERCHANT_ID";
    public final static String RBS_PAYOUT_USERNAME = "RBS_PAYOUT_USERNAME";
    public final static String RBS_PAYOUT_PASSWORD = "RBS_PAYOUT_PASSWORD";

    public final static String RBS_3D_MERCHANT_ID = "RBS_3D_MERCHANT_ID";
    public final static String RBS_RG_MERCHANT_ID = "RBS_RG_MERCHANT_ID";
    public final static String RBS_IM_MERCHANT_ID = "RBS_IM_MERCHANT_ID";
    public final static String RBS_RD_MERCHANT_ID = "RBS_RD_MERCHANT_ID";
    public final static String RBS_3D_USERNAME = "RBS_3D_USERNAME";
    public final static String RBS_RG_USERNAME = "RBS_RG_USERNAME";
    public final static String RBS_PT_USERNAME = "RBS_PT_USERNAME";
    public final static String RBS_RD_USERNAME = "RBS_RD_USERNAME";
    public final static String RBS_IM_USERNAME = "RBS_IM_USERNAME";
    public final static String RBS_REFUND_USERNAME = "RBS_REFUND_USERNAME";
    public final static String RBS_3D_PASSWORD = "RBS_3D_PASSWORD";
    public final static String RBS_RG_PASSWORD = "RBS_RG_PASSWORD";
    public final static String RBS_PT_PASSWORD = "RBS_PT_PASSWORD";
    public final static String RBS_RD_PASSWORD = "RBS_RD_PASSWORD";
    public final static String RBS_IM_PASSWORD = "RBS_IM_PASSWORD";
    public final static String RBS_REFUND_PASSWORD = "RBS_REFUND_PASSWORD";
    public final static String RBS_3D_TEST = "RBS_3D_TEST";
    public final static String RBS_3D_TEST_DEFAULT = "1";
    public final static String RBS_RG_ENABLED = "RBS_RG_ENABLED";
    public final static String RBS_3D_ENABLED = "RBS_3D_ENABLED";
    public final static String RBS_RG_SCORE_SKIP = "RBS_RG_SCORE_SKIP";
    public final static String RBS_RG_SEND_EMAIL = "RBS_RG_SEND_EMAIL";
    public final static String RBS_RD_TEST = "RBS_RD_TEST";
    public final static String RBS_RD_TEST_DEFAULT = "1";
    public final static String RBS_RD_URL = "RBS_RD_URL";
    public final static String RBS_RD_URL_DEFAULT = "https://trx9.wpstn.com/stlinkssl/stlink.dll";

    public final static String DEPOSIT_RETURN_LAYOUT = "deposit.return.layout";
    public final static Boolean DEPOSIT_RETURN_LAYOUT_DEFAULT = Boolean.FALSE;

    public final static String PSP_SEND_MOBILE = "PSP_SEND_MOBILE";

    public final static String RBS_USE_FORCED_REFUND = "RBS_USE_FORCED_REFUND";
    public final static String RBS_FORCED_REFUND_ONLY = "RBS_FORCED_REFUND_ONLY";

    public final static String WIRECARD_USE_FORCED_REFUND = "WIRECARD_USE_FORCED_REFUND";

    public final static String KEY_SEND_PENDING_DEPOSIT_NOTIFICATION_EMAIL = "SendPendingDepositNotificationEmail";
    public final static Boolean DEFAULT_SEND_PENDING_DEPOSIT_NOTIFICATION_EMAIL = Boolean.TRUE;

    public final static String PS4_MERCHANT_ID = "PS4.MerchantID";
    public final static String PS4_PASSWORD = "PS4.Password";
    public final static String PS4_SITE_ID = "PS4.SiteID";
    public final static String PS4_URL = "PS4.URL";

    public final static String PS4_MERCHANT_ID_DEFAULT = "omega";
    public final static String PS4_PASSWORD_DEFAULT = "nFOW281nd@fe";
    public final static String PS4_SITE_ID_DEFAULT = "0000";
    public final static String PS4_URL_DEFAULT = "https://ps4-staging.protected.ca/api/authorize";


    public final static String KEY_HIPAY_URL = "hipay.URL";
    public final static String KEY_HIPAY_LOGIN = "hipay.login";
    public final static String KEY_HIPAY_PASSWORD = "hipay.password";
    public final static String KEY_HIPAY_ACCOUNT = "hipay.account";
    public final static String KEY_HIPAY_RETURN_URL = "hipay.returnUrl";
    public final static String KEY_HIPAY_FAILED_URL = "hipay.failedUrl";
    public final static String KEY_HIPAY_URL_CANCEL = "hipay.cancelUrl";
    public final static String KEY_HIPAY_URL_ACK = "hipay.callbackUrl";
    public final static String KEY_HIPAY_EMAIL_ACK = "hipay.callbackEmail";
    public final static String KEY_HIPAY_BGCOLOR = "hipay.bgcolor";
    public final static String KEY_HIPAY_LOGO_URL = "hipay.logoUrl";
    public final static String KEY_HIPAY_SITEID = "hipay.merchantSiteId";
    public final static String KEY_HIPAY_CATEGORY = "hipay.category";
    public final static String DEFAULT_HIPAY_URL = "https://payment.hipay.com/order/";
    public final static String DEFAULT_HIPAY_RETURN_URL = "/ps/priv/DepositHipayReturn.action";
    public final static String DEFAULT_HIPAY_FAILED_URL = "/ps/priv/DepositHipayFailed.action";
    public final static String DEFAULT_HIPAY_URL_CANCEL = "/ps/priv/DepositHipayCancel.action";
    public final static String DEFAULT_HIPAY_URL_ACK = "/ps/pub/DepositHipayCallback.action";
    public final static String DEFAULT_HIPAY_EMAIL_ACK = "";
    public final static String DEFAULT_HIPAY_BGCOLOR = "#FFFFFF";
    public final static String DEFAULT_HIPAY_LOGO_URL = "";

    public final static String KEY_MASKBANKINFO = "maskBankInfo";

    public final static String  KEY_PENDING_DEPOSIT_TIMEOUT = "PENDING_DEPOSIT_TIMEOUT";
    public final static Integer DEFAULT_PENDING_DEPOSIT_TIMEOUT = 30;

    public final static String VAMEX_SMARTCHEQUE_USERNAME = "vamex.smartcheque.username";
    public final static String VAMEX_SMARTCHEQUE_PASSWORD = "vamex.smartcheque.password";
    public final static String VAMEX_NON_SMARTCHEQUE_USERNAME = "vamex.nonsmartcheque.username";
    public final static String VAMEX_NON_SMARTCHEQUE_PASSWORD = "vamex.nonsmartcheque.password";
    public final static String VAMEX_URL = "vamex.url";
    public final static String VAMEX_URL_DEFAULT = "https://directapi1.londonmultigames.com/wallet.ashx";
    public final static String VAMEX_MERCHANT_ID = "vamex.merchantId";
    public final static String KEY_VAMEX_RETURN_URL = "vamex.returnUrl";
    public final static String DEFAULT_VAMEX_RETURN_URL = "/ps/priv/DepositVamexReturn.action";
    public final static String KEY_VAMEX_CALLBACK_URL = "vamex.callbackUrl";
    public final static String DEFAULT_VAMEX_CALLBACK_URL = "/ps/pub/DepositVamex3DCallback.action";
    public final static String KEY_VAMEX_SMARTCHEQUE_SECRET_WORD = "vamex.smartcheque.secretWord";
    public final static String KEY_VAMEX_NONSMARTCHEQUE_SECRET_WORD = "vamex.nonsmartcheque.secretWord";

    public final static String INPAY_URL = "inpay.url";
    public final static String INPAY_URL_DEFAULT = "https://test-admin.inpay.com/api";
    public final static String KEY_INPAY_MERCHANT_ID = "inpay.merchant.id";
    public final static String DEFAULT_INPAY_MERCHANT_ID = "892";
    public final static String KEY_INPAY_SECRET_KEY = "inpay.secret.key";
    public final static String DEFAULT_INPAY_SECRET_KEY = "hs5L0037";
    public final static String KEY_INPAY_API_VERSION = "inpay.api.version";
    public final static String DEFAULT_INPAY_API_VERSION = "v2";
    public final static String KEY_INPAY_TEST_MODE = "inpay.testmode";
    public final static Boolean DEFAULT_INPAY_TEST_MODE = Boolean.FALSE;
    public final static String KEY_INPAY_API_GETCOUNTRIESANDBANK_ONLYRELEVANT = "inpay.api.getCountriesAndBanks.onlyRelevant";
    public final static String KEY_INPAY_BANK_MATCH_CURRENCY = "inpay.bank.match.currency";

    public final static String ISETTLE_URL = "isettle.url";
    public final static String ISETTLE_URL_DEFAULT = "https://testapi.isettle.biz";
    public final static String ISETTLE_DEPOSIT_URL = "isettle.deposit.url";
    public final static String ISETTLE_DEPOSIT_URL_DEFAULT = "https://testgateway.isettle.biz/payment/welcome";
    public final static String ISETTLE_APIKEY = "isettle.apiKey";
    public final static String ISETTLE_APIKEY_DEFAULT = "8de0f4bd5c9df796ec3c038533cb520b";
    public final static String ISETTLE_SECRET = "isettle.secret";
    public final static String ISETTLE_SECRET_DEFAULT = "05af114e";
    public final static String KEY_ISETTLE_RETURN_URL     = "isettle.returnUrl";
    public final static String DEFAULT_ISETTLE_RETURN_URL = "/ps/priv/DepositISettleReturn.action";


    public final static String KEY_HIPAY_SOAP_LOGIN = "hipay.soap.login";
    public final static String DEFAULT_HIPAY_SOAP_LOGIN = "434ea4f3f55c678bb3c0f4dbdb6a9613";
    public final static String KEY_HIPAY_SOAP_PASSWORD = "hipay.soap.password";
    public final static String DEFAULT_HIPAY_SOAP_PASSWORD = "7d51ac5acdecf08490cad59f7ec5be4a";
    public final static String KEY_HIPAY_SOAP_WEBSITEID = "hipay.soap.websiteId";
    public final static int    DEFAULT_HIPAY_SOAP_WEBSITEID = 354667;
    public final static String KEY_HIPAY_SOAP_CATEGORYID = "hipay.soap.categoryId";
    public final static int    DEFAULT_HIPAY_SOAP_CATEGORYID = 640;
    //Reuse the existing callback to see if they works or not.
    public final static String KEY_HIPAY_SOAP_URL = "hipay.soap.url";
    public final static String KEY_HIPAY_SOAP_CALLBACK = "hipay.soap.callback";
    public final static String DEFAULT_HIPAY_SOAP_CALLBACK = "/ps/pub/DepositHipayCallback.action";
    public final static String KEY_HIPAY_SOAP_URL_ACCEPT = "hipay.soap.urlAccept";
    public final static String DEFAULT_HIPAY_SOAP_URL_ACCEPT = "/ps/priv/DepositHipayReturn.action";
    public final static String KEY_HIPAY_SOAP_URL_DECLINE = "hipay.soap.urlDecline";
    public final static String DEFAULT_HIPAY_SOAP_URL_DECLINE = "/ps/priv/DepositHipayFailed.action";
    public final static String KEY_HIPAY_SOAP_URL_CANCEL = "hipay.soap.urlCancel";
    public final static String DEFAULT_HIPAY_SOAP_URL_CANCEL = "/ps/priv/DepositHipayCancel.action";

    public final static String KEY_WORLDPAYHPP_SUCCESS_URL     = "worldpay.hpp.successUrl";
    public final static String DEFAULT_WORLDPAYHPP_SUCCESS_URL = "/ps/priv/DepositWorldpayHPPReturn.action?action=success";
    public final static String KEY_WORLDPAYHPP_PENDING_URL     = "worldpay.hpp.pendingUrl";
    public final static String DEFAULT_WORLDPAYHPP_PENDING_URL = "/ps/priv/DepositWorldpayHPPReturn.action?action=pending";
    public final static String KEY_WORLDPAYHPP_FAILURE_URL     = "worldpay.hpp.failureUrl";
    public final static String DEFAULT_WORLDPAYHPP_FAILURE_URL = "/ps/priv/DepositWorldpayHPPReturn.action?action=failure";
    public final static String KEY_WORLDPAYHPP_CANCEL_URL     = "worldpay.hpp.cancelUrl";
    public final static String DEFAULT_WORLDPAYHPP_CANCEL_URL = "/ps/priv/DepositWorldpayHPPReturn.action?action=cancel";

    public final static String KEY_WORLDPAY_REJECT_NAME_MISMATCH        = "worldpay.reject.nameMismatch";
    public final static Boolean DEFAULT_WORLDPAY_REJECT_NAME_MISMATCH   = false;

    public final static String KEY_WORLDPAYFORM_ENABLED        = "worldpay.form.enabled";
    public final static Boolean DEFAULT_WORLDPAYFORM_ENABLED   = false;
    public final static String KEY_WORLDPAYFORM_RETURN_URL     = "worldpay.form.returnUrl";
    public final static String DEFAULT_WORLDPAYFORM_RETURN_URL = "/ps/priv/DepositWorldpayFormReturn.action";
    public final static String KEY_WORLDPAYFORM_CANCEL_URL     = "worldpay.form.cancelUrl";
    public final static String DEFAULT_WORLDPAYFORM_CANCEL_URL = "/ps/priv/DepositWorldpayFormReturn.action?action=cancel";
    public final static String KEY_WORLDPAYFORM_CCS_URL        = "worldpay.form.ccsUrl";
    public final static String DEFAULT_WORLDPAYFORM_CCS_URL    = "/ps/static/html/worldpayForm.css";
    public final static String KEY_WORLDPAYFORM_TEMPCARD_RETAININDAY = "worldpay.form.tempcard.retainInDay";
    public final static Integer DEFAULT_WORLDPAYFORM_TEMPCARD_RETAININDAY = 180;

    public final static String PSP_EMAIL_MASKING = "PSP.email.masking";
    public final static Boolean PSP_EMAIL_MASKING_DEFAULT = Boolean.FALSE;
    public final static String PSP_EMAIL_MASKING_LENGTH = "PSP.email.masking.length";
    public final static Integer PSP_EMAIL_MASKING_LENGTH_DEFAULT = 50;

    public final static String ASTROPAYCARD_URL = "astropaycard.url";
    public final static String ASTROPAYCARD_URL_DEFAULT = "https://sandbox.astropaycard.com/verif/validator.php";
    public final static String ASTROPAYCARD_LOGIN = "astropaycard.login";
    public final static String ASTROPAYCARD_LOGIN_DEFAULT = "sFD9PqV6XA";
    public final static String ASTROPAYCARD_TRAN_KEY = "astropaycard.tranKey";
    public final static String ASTROPAYCARD_TRAN_KEY_DEFAULT = "ceNokLtiVv";
    public final static String ASTROPAYCARD_TEST_REQUEST_KEY = "astropaycard.testRequest";
    public final static String ASTROPAYCARD_TEST_REQUEST_DEFAULT = "Y";

    public final static String KEY_REDBARON_TXHANDLER_URL = "redbaron.txhandler.url";
    public final static String DEFAULT_REDBARON_TXHANDLER_URL = "https://secure.redbaronpayments.com/secure/txHandler.php";

    public final static String KEY_WIRECARD_PAGE_URL = "wirecard.page.url";
    public final static String DEFAULT_WIRECARD_PAGE_URL = "https://checkout.wirecard.com/page/init.php";

    public final static String KEY_WIRECARD_TOOLKIT_URL = "wirecard.toolkit.url";
    public final static String DEFAULT_WIRECARD_TOOLKIT_URL = "https://checkout.wirecard.com/page/toolkit.php";

    public final static String KEY_WIRECARD_TOOLKIT_PASSWORD = "wirecard.toolkit.password";
    public final static String DEFAULT_WIRECARD_TOOLKIT_PASSWORD = "jcv45z";


    public final static String KEY_NXPAY_MERCHANT_AUTH_KEY = "nxpay.merchant.authKey";
    public final static String DEFAULT_NXPAY_MERCHANT_AUTH_KEY = "13946173573677638067";
    public final static String KEY_NXPAY_MERCHANT_WALLET_NUMBER = "nxpay.merchant.walletNumber";
    public final static String DEFAULT_NXPAY_MERCHANT_WALLET_NUMBER = "000000010266";
    public final static String KEY_NXPAY_SOURCE_ACCOUNT = "nxpay.sourceAccount";
    public final static String DEFAULT_NXPAY_SOURCE_ACCOUNT = "0000000102660103";
    public final static String KEY_NXPAY_API_URL = "nxpay.apiUrl";
    public final static String DEFAULT_NXPAY_API_URL = "https://www.nxdemo.eu/CoreServicesAPI";

    public final static String SKRILL_PAYSAFECARD_URL = "skrill.paysafecard.url";
    public final static String SKRILL_PAYSAFECARD_URL_DEFAULT = "https://psp.sandbox.dev.skrillws.net/v1/json/3e40a821/channelid/paysafecard";
    public final static String KEY_SKRILL_PAYSAFECARD_RETURN_URL = "skrill.paysafecard.returnUrl";
    public final static String DEFAULT_SKRILL_PAYSAFECARD_RETURN_URL = "/ps/priv/DepositSkrillReturn.action";
    public final static String KEY_SKRILL_PAYSAFECARD_RESPONSE_URL = "skrill.paysafecard.responseUrl";
    public final static String DEFAULT_SKRILL_PAYSAFECARD_RESPONSE_URL = "/ps/pub/DepositSkrillCallback.action";

    public final static String EPRO_URL = "epro.url";
    public final static String EPRO_URL_DEFAULT = "https://www.empcorp-lux.com/api/";
    public final static String EPRO_API_KEY = "epro.api.key";
    public final static String KEY_EPRO_3DCALLBACK_URL = "epro.3DcallbackUrl";
    public final static String DEFAULT_EPRO_3DCALLBACK_URL = "/ps/priv/DepositEPro3DReturn.action";

    public final static String KEY_IBANQ_DEPOSIT_URL = "iBanq.deposit.url";
    public final static String DEFAULT_IBANQ_DEPOSIT_URL = "https://www.i-banq.com/transferapi/index.html";

    public final static String KEY_IBANQ_WITHDRAW_URL = "iBanq.withdraw.url";
    public final static String DEFAULT_IBANQ_WITHDRAW_URL = "https://www.i-banq.com/paymentapi/index.html";

    public final static String KEY_IBANQ_MID = "iBanq.mid";
    public final static String DEFAULT_IBANQ_MID = "Q117761";

    public final static String KEY_IBANQ_MUID = "iBanq.muid";
    public final static String DEFAULT_IBANQ_MUID = "Gamingtec";
    public final static String KEY_IBANQ_MERCHANT_PASSWORD = "iBanq.merchant.password";
    public final static String DEFAULT_IBANQ_MERCHANT_PASSWORD = "gamingtec101";

    //Worldpay HPP
    public final static String WORLDPAYHPP_VERSION = "worldpay.hpp.version";
    public final static String DEFAULT_WORLDPAYHPP_VERSION = "1.4";
    public final static String WORLDPAYHPP_MERCHANTCODE = "worldpay.hpp.merchantCode";
    public final static String DEFAULT_WORLDPAYHPP_MERCHANTCODE = "TBA";
    public final static String WORLDPAYHPP_INSTALLATIONID = "worldpay.hpp.installationId";
    public final static String DEFAULT_WORLDPAYHPP_INSTALLATIONID = "TBA";
    public final static String WORLDPAYHPP_URL = "worldpay.hpp.url";
    public final static String DEFAULT_WORLDPAYHPP_URL = "https://secure-test.worldpay.com/jsp/merchant/xml/paymentService.jsp";
    public final static String WORLDPAYHPP_SECRET = "worldpay.hpp.secret";
    public final static String DEFAULT_WORLDPAYHPP_SECRET = "@p-p1epie";

    //Alliedwallet
    public final static String ALLIEDWALLET_URL = "alliedwallet.url";
    public final static String ALLIEDWALLET_URL_DEFAULT = "http://service.381808.com";
    public final static String ALLIEDWALLET_MERCHANTID_KEY = "alliedwallet.merchantid";
    public final static String ALLIEDWALLET_MERCHANTID_DEFAULT = "0da45a90-671a-4716-b79e-ccbc80760829";
    public final static String ALLIEDWALLET_SITEID_KEY = "alliedwallet.siteid";
    public final static String ALLIEDWALLET_SITEID_DEFAULT = "9047c1c0-a554-43e6-b299-bfc3801d9a80";
    public final static String KEY_ALLIEDWALLET_RETURN_URL     = "alliedwallet.return.url";
    public final static String DEFAULT_ALLIEDWALLET_RETURN_URL = "/ps/priv/DepositAlliedwalletReturn.action";

    // Ecommpay
    public final static String ECOMMPAY_GATE_URL = "ecommpay.url";
    public final static String ECOMMPAY_GATE_URL_DEFAULT = "https://gate.ecommpay.com";

    public final static String ECOMMPAY_SALT = "ecommpay.salt";
    public final static String ECOMMPAY_SALT_DEFAULT = "847847a3c68b00c3ec9a695c6dd3d2934b5c7122";
    public final static String ECOMMPAY_SITEID = "ecommpay.siteId";
    public final static String ECOMMPAY_SITEID_DEFAULT = "2983";
    public final static String ECOMMPAY_TERMINAL_URL = "ecommpay.terminal.url";
    public final static String ECOMMPAY_TERMINAL_URL_DEFAULT = "https://terminal.ecommpay.com/";
    public final static String ECOMMPAY_TERMINAL_RETURN_URL = "ecommpay.terminal.return.url";
    public final static String ECOMMPAY_TERMINAL_RETURN_URL_DEFAULT = "/ps/priv/DepositEcommpayReturn.action";

    public final static String ECOMMPAY_TERMINAL_LANGUAGE = "ecommpay.terminal.language";
    public final static String ECOMMPAY_TERMINAL_LANGUAGE_DEFAULT = "en,ru,tr,de,fr,it,es,sv,ro,lv,pt";
    public final static String ECOMMPAY_TERMINAL_DEFAULT_LANGUAGE = "ecommpay.terminal.default.language";
    public final static String ECOMMPAY_TERMINAL_DEFAULT_LANGUAGE_DEFAULT = "en";

    // pago
    public final static String PAGO_URL = "pago.url";
    public final static String PAGO_MERCHANT_ID = "pago.merchantId";
    public final static String PAGO_MERCHANT_PASSCODE = "pago.merchantPassCode";
    public final static String PAGO_BACKOFFICE_USERNAME = "pago.pago.backofficeUserName";
    public final static String PAGO_BACKOFFICE_PASSWORD = "pago.backofficePassword";

    public final static String PAGO_RETURN_URL = "pago.returnUrl";
    public final static String PAGO_RETURN_URL_DEFAULT = "/ps/priv/DepositPagoReturn.action";
    public final static String PAGO_NOTIFY_URL = "pago.notifyUrl";
    public final static String PAGO_NOTIFY_URL_DEFAULT = "/ps/pub/DepositPagoCallback.action";

}
