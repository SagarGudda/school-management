import { useEffect, useState } from "react";
import { BrowserRouter as Router, Routes, Route, useNavigate } from "react-router-dom";
import keycloak from "./keycloak";

import PrivateRoute from "./components/PrivateRoute";
import Dashboard from "./pages/Dashboard";
import HomePage from "./pages/HomePage";
import StudentPage from "./pages/StudentPage";
import TeacherPage from "./pages/TeacherPage";

// ⚠️ Wrap keycloak logic inside a nested component to use navigate
const AppWrapper = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const navigate = useNavigate();

useEffect(() => {
  if (!window.keycloakInited) {
    window.keycloakInited = true;

    keycloak.init({ onLoad: "login-required" }).then((auth) => {
      if (auth) {
        localStorage.setItem("token", keycloak.token);
        setIsAuthenticated(true);
        navigate("/dashboard");
      } else {
        keycloak.login();
      }
    });
  }
}, []);

  if (!isAuthenticated) return <div>Loading...</div>;

  return (
    <Routes>
      <Route
        path="/dashboard"
        element={
          <PrivateRoute>
            <Dashboard />
          </PrivateRoute>
        }
      >
        <Route index element={<HomePage />} />
        <Route path="students" element={<StudentPage />} />
        <Route path="teachers" element={<TeacherPage />} />
      </Route>
    </Routes>
  );
};

const App = () => (
  <Router>
    <AppWrapper />
  </Router>
);

export default App;
