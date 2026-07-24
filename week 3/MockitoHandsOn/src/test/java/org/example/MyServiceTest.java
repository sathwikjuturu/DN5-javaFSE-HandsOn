package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testFetchData() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stubbing
        when(mockApi.getData()).thenReturn("Mockito Success");

        // Inject Mock
        MyService service = new MyService(mockApi);

        // Assertion
        assertEquals("Mockito Success", service.fetchData());

        // Verify Interaction
        verify(mockApi).getData();
    }
}