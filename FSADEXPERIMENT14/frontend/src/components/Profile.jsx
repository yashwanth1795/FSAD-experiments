import { useState, useEffect } from 'react';
import axios from 'axios';

function Profile({ user }) {
  const [profile, setProfile] = useState(null);
  const [error, setError] = useState('');

  useEffect(() => {
    const fetchProfile = async () => {
      try {
        const response = await axios.get(`http://localhost:8080/auth/profile/${user.id}`);
        setProfile(response.data);
      } catch (err) {
        setError('Failed to load profile');
      }
    };
    if (user.id) fetchProfile();
  }, [user.id]);

  if (error) return <p className="error">{error}</p>;
  if (!profile) return <p>Loading profile...</p>;

  return (
    <div className="card">
      <h2>Profile</h2>
      <p><strong>Username:</strong> {profile.username}</p>
      <p><strong>Email:</strong> {profile.email}</p>
      <p><strong>ID:</strong> {profile.id}</p>
    </div>
  );
}

export default Profile;
