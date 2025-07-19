import { Outlet } from "react-router-dom";
import Sidebar from "../components/Sidebar";

function Dashboard() {
  return (
    <div className="flex h-screen">
      <Sidebar />
      <main className="flex-1 bg-gray-100 p-4 overflow-y-auto">
        <Outlet />
      </main>
    </div>
  );
}

export default Dashboard;
