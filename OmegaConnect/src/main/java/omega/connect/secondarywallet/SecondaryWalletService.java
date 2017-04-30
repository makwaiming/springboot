package omega.connect.secondarywallet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is not need for an interface.
 * TODO why not interface ? is that Better.
 */
@Service
@Transactional
public class SecondaryWalletService  {
    private Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public SecondaryWalletService() {

    }

    public void ping() {
        log.info("get a ping");
    }
}
