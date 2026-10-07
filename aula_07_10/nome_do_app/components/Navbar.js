```jsx
import { View, Text, StyleSheet } from 'react-native';

export default function Navbar() {
  return (
    <View style={styles.navbar}>

      <Text style={styles.logo}>
        Meu App
      </Text>

      <View style={styles.links}>
        <Text style={styles.link}>Início</Text>
        <Text style={styles.link}>Sobre</Text>
        <Text style={styles.link}>Perfil</Text>
      </View>

    </View>
  );
}

const styles = StyleSheet.create({
  navbar: {
    height: 70,
    backgroundColor: '#222',

    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',

    paddingHorizontal: 20,
  },

  logo: {
    color: '#fff',
    fontSize: 20,
    fontWeight: 'bold',
  },

  links: {
    flexDirection: 'row',
    gap: 20,
  },

  link: {
    color: '#fff',
    fontSize: 16,
  },
});
```