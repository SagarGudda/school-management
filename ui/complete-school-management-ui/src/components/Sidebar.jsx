import { Link, useNavigate } from "react-router-dom";

function Sidebar() {
  const navigate = useNavigate();

  const logout = () => {
    localStorage.removeItem("isLoggedIn");
    navigate("/login");
  };

  return (
    <aside className="w-64 bg-white shadow h-full flex flex-col">
      <h2 className="text-xl font-bold p-4 border-b">School Admin</h2>
      <nav className="flex-1 p-4 space-y-2">
        <Link to="/dashboard/students" className="block text-blue-600 hover:underline">Students</Link>
        <Link to="/dashboard/teachers" className="block text-blue-600 hover:underline">Teachers</Link>
      </nav>
      <button onClick={logout} className="bg-red-500 text-white py-2 m-4 rounded hover:bg-red-600">
        Logout
      </button>
    </aside>
  );
}

export default Sidebar;
