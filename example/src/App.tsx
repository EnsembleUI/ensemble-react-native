
import { openEnsembleApp } from 'ensemble-react-native';
import {
  SafeAreaView,
  View,
  Text,
  StyleSheet,
  TouchableOpacity,
  StatusBar,
} from 'react-native';



const HomeScreen = () => {

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar barStyle="light-content" />
      <View style={styles.header}>
        <Text style={styles.headerText}>React Native Screen</Text>
      </View>
      <View style={styles.content}>
        <Text style={styles.description}>
          This is a Native screen. Press the button below to navigate to a Flutter screen.
        </Text>
        <TouchableOpacity style={styles.button} onPress={openEnsembleApp}>
          <Text style={styles.buttonText}>Go to Ensemble Screen</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.footer}>
        <Text style={styles.footerText}>React Native & Ensemble Integration</Text>
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1e1e1e',
  },
  header: {
    padding: 20,
    alignItems: 'center',
    borderBottomWidth: 1,
    borderBottomColor: '#333',
  },
  headerText: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#fff',
  },
  content: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 20,
  },
  description: {
    fontSize: 16,
    color: '#ccc',
    textAlign: 'center',
    marginBottom: 30,
  },
  button: {
    backgroundColor: '#0080ff',
    paddingHorizontal: 20,
    paddingVertical: 12,
    borderRadius: 25,
  },
  buttonText: {
    color: '#fff',
    fontSize: 18,
    fontWeight: 'bold',
  },
  footer: {
    padding: 10,
    alignItems: 'center',
  },
  footerText: {
    color: '#888',
    fontSize: 12,
  },
});

export default HomeScreen;