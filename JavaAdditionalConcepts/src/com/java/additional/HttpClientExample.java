package com.java.additional;

import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.PushPromiseHandler;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

public class HttpClientExample {

	public static void main(String[] args) {
		
		String apiKey = "ef38bdbd9f3d440eac63d778454eed45";
		String url = "https://newsapi.org/v2/everything?q=tesla&from=2024-10-28&sortBy=publishedAt&apiKey="+apiKey;
		
		//1. Create the Http Client
		//2. Create the Http Request
		//3. Create the Http response for the sent request using the client
		
//		HttpClient hc = new HttpClient() {
//			
//			@Override
//			public Version version() {
//				// TODO Auto-generated method stub
//				return Version.HTTP_2;
//			}
//			
//			@Override
//			public SSLParameters sslParameters() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public SSLContext sslContext() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, BodyHandler<T> responseBodyHandler,
//					PushPromiseHandler<T> pushPromiseHandler) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, BodyHandler<T> responseBodyHandler) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public <T> HttpResponse<T> send(HttpRequest request, BodyHandler<T> responseBodyHandler)
//					throws IOException, InterruptedException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Optional<ProxySelector> proxy() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Redirect followRedirects() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Optional<Executor> executor() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Optional<CookieHandler> cookieHandler() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Optional<Duration> connectTimeout() {
//				// TODO Auto-generated method stub
//				return Optional.ofNullable(Duration.ofSeconds(10));
//			}
//			
//			@Override
//			public Optional<Authenticator> authenticator() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		
		HttpClient httpClient = HttpClient.newBuilder()
								.version(HttpClient.Version.HTTP_2)
								.connectTimeout(Duration.ofSeconds(10)).build();
		
		
//		HttpRequest htr = new HttpRequest() {
//			
//			@Override
//			public Optional<Version> version() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public URI uri() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public Optional<Duration> timeout() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public String method() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public HttpHeaders headers() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public boolean expectContinue() {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public Optional<BodyPublisher> bodyPublisher() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		
		
		try {
			HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("Http Response: " + httpResponse);
			System.out.println("Http Response Body: " + httpResponse.body());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
