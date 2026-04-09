import { Link } from 'react-router-dom';

function Navbar({ onLogout }) {
  return (
    <nav>
      <div>
        <Link to="/home">Home</Link>
        <Link to="/profile">Profile</Link>
      </div>
      <button onClick={onLogout}>Logout</button>
    </nav>
  );
}

export default Navbar;
