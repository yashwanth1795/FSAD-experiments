import { useEffect, useState } from 'react';

function UserList() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    setLoading(true);
    setError(null);

    fetch('https://jsonplaceholder.typicode.com/users')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to load users API');
        }
        return response.json();
      })
      .then((data) => {
        setUsers(data);
      })
      .catch((err) => {
        setError(err.message);
      })
      .finally(() => {
        setLoading(false);
      });
  }, []);

  return (
    <div>
      <h2>Users API</h2>
      {loading && <div className="loading">Fetching users from JSONPlaceholder...</div>}
      {error && <div className="error">Error: {error}</div>}
      {!loading && !error && (
        <div>
          {users.length === 0 ? (
            <div className="no-data">No users returned.</div>
          ) : (
            users.map((user) => (
              <div key={user.id} className="card">
                <h3>{user.name}</h3>
                <p>Email: {user.email}</p>
                <p>Phone: {user.phone}</p>
              </div>
            ))
          )}
        </div>
      )}
    </div>
  );
}

export default UserList;
