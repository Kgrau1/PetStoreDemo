package persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swagger.PetStoreDao;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestServiceClient {

    @Test
    public void testGetPetIdSuccess() {
        PetStoreDao dao = new PetStoreDao();
        assertEquals(1, dao.getPetById());
    }
}