package com.example.hsa4;

import java.util.List;

public class PayloadWrapper {
    String client_id = "123456789";
    boolean non_personalized_ads = false;


    String timestamp_micros = "1689110632374015";
    List<PayloadEvent> events;

    public PayloadWrapper(String timestamp_micros, List<PayloadEvent> events) {
        this.timestamp_micros = timestamp_micros;
        this.events = events;
    }

    public String getTimestamp_micros() {
        return timestamp_micros;
    }

    public void setTimestamp_micros(String timestamp_micros) {
        this.timestamp_micros = timestamp_micros;
    }


    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public boolean isNon_personalized_ads() {
        return non_personalized_ads;
    }

    public void setNon_personalized_ads(boolean non_personalized_ads) {
        this.non_personalized_ads = non_personalized_ads;
    }

    public List<PayloadEvent> getEvents() {
        return events;
    }

    public void setEvents(List<PayloadEvent> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "PayloadWrapper{" +
                "client_id='" + client_id + '\'' +
                ", non_personalized_ads=" + non_personalized_ads +
                ", events=" + events +
                '}';
    }

    public static class PayloadEvent {
        String name = "bitcoin";
        PayloadEventParams params;

        public PayloadEvent(PayloadEventParams params) {
            this.params = params;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PayloadEventParams getParams() {
            return params;
        }

        public void setParams(PayloadEventParams params) {
            this.params = params;
        }

        @Override
        public String toString() {
            return "PayloadEvent{" +
                    "name='" + name + '\'' +
                    ", params=" + params +
                    '}';
        }
    }

    public static class PayloadEventParams {
        Integer value;
        Integer session_id = 123;
        String currency = "usd";
        String coin = "bitcoin";
        Integer debug_mode = 1;

        public PayloadEventParams(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getSession_id() {
            return session_id;
        }

        public void setSession_id(Integer session_id) {
            this.session_id = session_id;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getCoin() {
            return coin;
        }

        public void setCoin(String coin) {
            this.coin = coin;
        }

        public Integer getDebug_mode() {
            return debug_mode;
        }

        public void setDebug_mode(Integer debug_mode) {
            this.debug_mode = debug_mode;
        }

        @Override
        public String toString() {
            return "PayloadEventParams{" +
                    "value=" + value +
                    ", session_id=" + session_id +
                    ", currency='" + currency + '\'' +
                    ", coin='" + coin + '\'' +
                    ", debug_mode=" + debug_mode +
                    '}';
        }
    }
}
