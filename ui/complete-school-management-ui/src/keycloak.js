// src/keycloak.js
import Keycloak from "keycloak-js";

const keycloak = new Keycloak({
  url: "http://localhost:8080",
  realm: "school-realm",
  clientId: "school-ui",
});

export default keycloak;
