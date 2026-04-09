import { useEffect, useState } from 'react';
import axios from 'axios';

function FakePostList() {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const fetchPosts = () => {
    setLoading(true);
    setError(null);

    axios
      .get('https://dummyjson.com/posts')
      .then((response) => {
        setPosts(response.data.posts || []);
      })
      .catch((err) => {
        setError(err.message || 'Failed to fetch fake posts');
      })
      .finally(() => {
        setLoading(false);
      });
  };

  useEffect(() => {
    fetchPosts();
  }, []);

  return (
    <div>
      <div className="refresh-row">
        <button type="button" onClick={fetchPosts} disabled={loading}>
          Refresh Posts
        </button>
      </div>
      <h2>Fake API Posts</h2>
      {loading && <div className="loading">Loading fake API posts...</div>}
      {error && <div className="error">Error: {error}</div>}
      {!loading && !error && (
        <div>
          {posts.length === 0 ? (
            <div className="no-data">No posts available.</div>
          ) : (
            posts.map((post) => (
              <div key={post.id} className="card">
                <h3>{post.title}</h3>
                <p>{post.body}</p>
              </div>
            ))
          )}
        </div>
      )}
    </div>
  );
}

export default FakePostList;
