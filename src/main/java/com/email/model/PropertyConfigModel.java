package com.email.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app")
public class PropertyConfigModel {
    private String name;
    private int age;
    private int height;
    private String subject;
    private Security Security;

    public static class Security{
        private String username;
        private String password;
        private List<String> roles = new ArrayList<>();
        private boolean enabled;

        private Map<String,String> permissions = new HashMap<>();


        @Override
        public String toString() {
            return "Security{" +
                    "enabled=" + enabled +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", roles=" + roles +
                    ", permissions=" + permissions +
                    '}';
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Map<String, String> getPermissions() {
            return permissions;
        }

        public void setPermissions(Map<String, String> permissions) {
            this.permissions = permissions;
        }
    }

    @Override
    public String toString() {
        return "PropertyConfigModel{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", subject='" + subject + '\'' +
                ", Security=" + Security +
                '}';
    }

    public PropertyConfigModel.Security getSecurity() {
        return Security;
    }

    public void setSecurity(PropertyConfigModel.Security security) {
        Security = security;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
