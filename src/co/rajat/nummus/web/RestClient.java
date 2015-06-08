package co.rajat.nummus.web;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class RestClient
{
    public static void main (String args[])
    {
        String uri = "https://www.amfiindia.com/modules/NavHistoryAll";
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("fDate", "29-May-2015");
        
        doPostRequest(uri, formData);
    }
    
    public static String doPostRequest(String uri, MultivaluedMap<String, String> formData)
    {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource webResource = client.resource(UriBuilder.fromUri(uri).build());
        ClientResponse response = webResource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(ClientResponse.class, formData);
        return response.getEntity(String.class);
    }
}
